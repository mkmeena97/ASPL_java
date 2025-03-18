import java.sql.SQLException;

// Custom Exception for Database Errors
class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
}

public class SQLExceptionDemo {
    public static void main(String[] args) {
        try {
            connectToDatabase(false); // Simulate a database connection error
            executeQuery(""); // Simulate an invalid query
            divide(10, 0); // Simulate an arithmetic exception
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (DatabaseException e) {
            System.out.println("Database Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Closing Database Connection... ✅");
        }
    }

    // Method to Simulate a Database Connection
    public static void connectToDatabase(boolean isConnected) throws DatabaseException {
        if (!isConnected) {
            throw new DatabaseException("Failed to connect to the database! 🔴");
        }
    }

    // Method to Simulate an SQL Query Execution
    public static void executeQuery(String query) throws SQLException {
        if (query.isEmpty()) {
            throw new SQLException("Query cannot be empty! 🔴");
        }
        System.out.println("Executing query: " + query);
    }

    // Method to Simulate an Arithmetic Exception
    public static void divide(int a, int b) {
        System.out.println("Result: " + (a / b)); // This will cause an exception if b = 0
    }
}

