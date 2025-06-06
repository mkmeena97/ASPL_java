package com.example.ReactiveMicroService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI todoOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Reactive Todo API")
                .description("Reactive Microservice Todo App using Spring WebFlux")
                .version("v1.0"));
    }
}

