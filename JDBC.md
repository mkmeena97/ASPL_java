# JDBC Statements in Detail: `Statement`, `PreparedStatement`, `CallableStatement` & Execution Methods

## 1. **Types of Statements in JDBC**
JDBC provides three types of statements to interact with the database:
1. **`Statement`** – Used for simple SQL queries without parameters.
2. **`PreparedStatement`** – Used for SQL queries with parameters and better performance.
3. **`CallableStatement`** – Used to call stored procedures from the database.

---

## 2. **`Statement`**
A `Statement` is used for executing static SQL queries. It is suitable for queries that do not require parameters.

### **Syntax:**
```java
Statement stmt = connection.createStatement();
```

### **Example Usage:**
```java
String sql = "SELECT * FROM users";
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}
```

### **Disadvantages of `Statement`:**
- **Not secure** – Vulnerable to SQL injection.
- **Less efficient** – The SQL query is compiled every time it is executed.

---

## 3. **`PreparedStatement`**
A `PreparedStatement` is a precompiled SQL statement that allows parameterized queries.

### **Syntax:**
```java
PreparedStatement pstmt = connection.prepareStatement(sql);
```

### **Example Usage:**
```java
String sql = "SELECT * FROM users WHERE id = ?";
PreparedStatement pstmt = connection.prepareStatement(sql);
pstmt.setInt(1, 1);
ResultSet rs = pstmt.executeQuery();
while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}
```

### **Advantages of `PreparedStatement`:**
✅ **Precompiled** – The SQL query is compiled once and can be executed multiple times.  
✅ **Prevents SQL Injection** – User input is treated as data, not code.  
✅ **Faster Execution** – Especially useful in batch execution.

---

## 4. **`CallableStatement`**
A `CallableStatement` is used to call stored procedures in the database.

### **Syntax:**
```java
CallableStatement cstmt = connection.prepareCall("{CALL stored_procedure_name(?, ?)}");
```

### **Example Usage (Calling a Stored Procedure):**
```java
CallableStatement cstmt = connection.prepareCall("{CALL GetUserById(?)}");
cstmt.setInt(1, 1);
ResultSet rs = cstmt.executeQuery();
while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}
```

### **Advantages of `CallableStatement`:**
✅ **Better Performance** – Stored procedures run inside the database, reducing network overhead.  
✅ **Encapsulates Business Logic** – Useful for complex database operations.

---

## 5. **Execution Methods in JDBC**

| Method | Description | Used With |
|---------|-------------|------------|
| `executeQuery()` | Executes a SELECT query and returns a `ResultSet` | `Statement`, `PreparedStatement`, `CallableStatement` |
| `executeUpdate()` | Executes INSERT, UPDATE, DELETE, and DDL (CREATE, ALTER) queries. Returns the number of affected rows. | `Statement`, `PreparedStatement` |
| `execute()` | Used when the query could be anything (SELECT, UPDATE, etc.). Returns `true` if the result is a `ResultSet`, else `false`. | `Statement`, `PreparedStatement`, `CallableStatement` |
| `addBatch()` | Adds multiple queries to a batch for batch processing. | `Statement`, `PreparedStatement` |
| `executeBatch()` | Executes all queries added using `addBatch()`. Returns an array of affected row counts. | `Statement`, `PreparedStatement` |

---

## 6. **Execution Methods in Detail**

### **1. `executeQuery()`**
- Used for SELECT queries.
- Returns a `ResultSet`.

```java
String sql = "SELECT * FROM users";
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}
```

---

### **2. `executeUpdate()`**
- Used for INSERT, UPDATE, DELETE queries.
- Returns the number of rows affected.

```java
String sql = "UPDATE users SET name = 'John' WHERE id = 1";
Statement stmt = connection.createStatement();
int rowsUpdated = stmt.executeUpdate(sql);
System.out.println(rowsUpdated + " row(s) updated.");
```

---

### **3. `execute()`**
- Used when the query type is unknown.
- Returns `true` if the first result is a `ResultSet`, otherwise `false`.

```java
String sql = "SELECT * FROM users";
Statement stmt = connection.createStatement();
boolean hasResultSet = stmt.execute(sql);
if (hasResultSet) {
    ResultSet rs = stmt.getResultSet();
    while (rs.next()) {
        System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
    }
}
```

---

### **4. `addBatch()` & `executeBatch()` (Batch Processing)**
- Used to execute multiple queries efficiently.
- Improves performance by reducing database round trips.

```java
Statement stmt = connection.createStatement();
stmt.addBatch("INSERT INTO users (name) VALUES ('Alice')");
stmt.addBatch("INSERT INTO users (name) VALUES ('Bob')");
stmt.addBatch("INSERT INTO users (name) VALUES ('Charlie')");
int[] results = stmt.executeBatch();
System.out.println("Batch executed with " + results.length + " statements.");
```

---

## 7. **Comparison of `Statement`, `PreparedStatement`, and `CallableStatement`**

| Feature | `Statement` | `PreparedStatement` | `CallableStatement` |
|---------|------------|------------------|----------------|
| Query Type | Static | Parameterized | Stored Procedures |
| SQL Injection Risk | High | Low | Low |
| Performance | Low | High (Query precompilation) | High (Executes inside DB) |
| Suitable for | Simple queries | Repeated queries with parameters | Calling stored procedures |

---

## 8. **Best Practices for JDBC**
- **Always close resources** (`ResultSet`, `Statement`, `Connection`) after use to prevent memory leaks.
- **Use `PreparedStatement` instead of `Statement`** to prevent SQL injection.
- **Use batch processing** when inserting/updating multiple rows to improve performance.
- **Use connection pooling** (e.g., **HikariCP**) to optimize database connections.
- **Use transactions (`conn.setAutoCommit(false)`)** when executing multiple queries that should be committed together.

---

## 9. **Conclusion**
- `Statement` is simple but inefficient for dynamic queries.
- `PreparedStatement` is secure and efficient for parameterized queries.
- `CallableStatement` is used for stored procedures and improves performance.
- Execution methods like `executeQuery()`, `executeUpdate()`, and `executeBatch()` help in different SQL operations.
