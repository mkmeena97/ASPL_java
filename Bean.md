# Spring Bean Creation and Autowiring

## Creating and Using Beans
### Declaring Beans
Beans can be declared in multiple ways:
- **Using `@Bean` annotation**: Annotate a method inside a `@Configuration` class.
- **Using `@Component` annotation**: Annotate a class with `@Component`, `@Service`, `@Repository`, or `@Controller`.
- **Using XML Configuration**: Define beans in an XML configuration file.

### Java-Based Configuration
```java
@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```

### XML-Based Configuration
```xml
<bean id="myService" class="com.example.MyService"/>
```

### Annotation-Driven Component
```java
@Component
public class MyService {
    ...
}
```

---

## Autowiring Beans
Spring provides several ways to autowire dependencies:

### Basic Autowiring
```java
@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```

### Autowiring All Beans of a Specific Type
```java
@Service
public class MyService {
    @Autowired
    private List<MyRepository> repositories;
}
```

---

## Autowiring Approaches
### Constructor Injection
```java
@Component
public class MyService {
    private final MyRepository myRepository;
    
    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
```

### Field Injection
```java
@Component
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```

### Setter Injection
```java
@Component
public class MyService {
    private MyRepository myRepository;
    
    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
```

---

## Using `FactoryBean` for Dynamic Bean Instantiation
```java
@Component
public class MyFactoryBean implements FactoryBean<MyService> {
    @Override
    public MyService getObject() throws Exception {
        return new MyService();
    }
    @Override
    public Class<?> getObjectType() {
        return MyService.class;
    }
}
```

---

## Autowiring Specific Bean Instances with `@Qualifier`
```java
@Component
public class MyService {
    @Autowired
    @Qualifier("specificBean")
    private MyRepository myRepository;
}
```

### Alternative Annotation: `@Primary`
If multiple beans of the same type exist, `@Primary` can specify the default.
```java
@Bean
@Primary
public MyRepository primaryRepository() {
    return new PrimaryRepository();
}
```

---

## Autowiring Specific Instances Using Generic Type Parameters
```java
@Component
public class MyService {
    @Autowired
    private GenericRepository<String> stringRepository;
}
```

---

## Injecting Prototype-Scoped Beans into Singletons
### Lookup Method Injection via XML Configuration
```xml
<bean id="singletonBean" class="com.example.SingletonBean">
    <lookup-method name="createPrototypeBean" bean="prototypeBean"/>
</bean>

<bean id="prototypeBean" class="com.example.PrototypeBean" scope="prototype"/>
```

### Lookup Method Injection via Java Configuration
```java
@Configuration
public class AppConfig {
    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean() {
            @Override
            public PrototypeBean createPrototypeBean() {
                return prototypeBean();
            }
        };
    }
    
    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
```

### Manual Lookup Method Injection
```java
@Component
public class SingletonBean {
    @Autowired
    private ApplicationContext applicationContext;
    
    public PrototypeBean getPrototypeBean() {
        return applicationContext.getBean(PrototypeBean.class);
    }
}
```

### Injecting Prototype-Scoped Bean via `javax.inject.Provider`
```java
@Component
public class SingletonBean {
    @Autowired
    private Provider<PrototypeBean> prototypeBeanProvider;
    
    public PrototypeBean getPrototypeBean() {
        return prototypeBeanProvider.get();
    }
}
```

## Bean Scopes

### Singleton Scope

- A single instance shared across the application.

```java
@Bean
public MyBean singletonBean() {
    return new MyBean();
}
```

### Prototype Scope

- A new instance is created every time the bean is requested.

```java
@Bean
@Scope("prototype")
public MyBean prototypeBean() {
    return new MyBean();
}
```

### Additional Scopes in Web-Aware Contexts

- **Request**: New instance per HTTP request
- **Session**: New instance per HTTP session
- **Application**: New instance per ServletContext
- **GlobalSession**: New instance per global session (Portlet environment)
- **WebSocket**: New instance per WebSocket session

#### XML Configuration

```xml
<bean id="myRequestBean" class="OneClass" scope="request"/>
<bean id="mySessionBean" class="AnotherClass" scope="session"/>
```

#### Java Configuration (Spring 4.3+)

```java
@Bean
@RequestScope
public OneClass myRequestBean() {
    return new OneClass();
}
```

### Lazy Singleton Beans

```java
@Bean
@Lazy
public MyBean lazySingletonBean() {
    return new MyBean();
}
```

## Conditional Bean Registration in Spring

Beans can be conditionally registered based on certain properties.

### Example: Register Beans Only When a Property is Specified

```java
@Bean
@ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
public MyBean conditionalBean() {
    return new MyBean();
}
```

### Condition Annotations

- `@ConditionalOnClass`
- `@ConditionalOnMissingClass`
- `@ConditionalOnWebApplication`
- `@ConditionalOnBean`
- `@ConditionalOnMissingBean`
- `@ConditionalOnProperty`
- `@ConditionalOnExpression`

#### Example:

```java
@Bean
@ConditionalOnClass(OObjectDatabaseTx.class)
@ConditionalOnMissingBean(OrientWebConfigurer.class)
public OrientWebConfigurer orientWebConfigurer() {
    return new OrientWebConfigurer();
}
```

### Other Conditions

- **Property Conditions**: `@ConditionalOnProperty`
- **Resource Conditions**: `@ConditionalOnResource`
- **Web Application Conditions**: `@ConditionalOnWebApplication`
- **SpEL Expression Conditions**: `@ConditionalOnExpression("'${env}' == 'dev'")`

### When to Use Conditional Annotations

- ``: When a class is available in the classpath.
- ``: When a class is not available.
- ``: When running in a web environment.
- ``: When a specific property is set.
- ``: When a SpEL expression evaluates to true.

---

This document provides an in-depth look at bean creation, dependency injection, bean scopes, and conditional registrations in Spring Framework.

