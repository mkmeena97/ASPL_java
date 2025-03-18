package OOPS;

class CloudStorage {
    private String username;
    private String password; // Hidden (Encapsulated)

    // Constructor
    public CloudStorage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter (only for username, password is private)
    public String getUsername() {
        return username;
    }

    // Secure Method to Authenticate User
    public boolean authenticate(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        CloudStorage user1 = new CloudStorage("techUser", "securePass123");

        // Access username, but password remains hidden
        System.out.println("Username: " + user1.getUsername());

        // Verify password
        System.out.println("Authentication: " + user1.authenticate("securePass123"));
    }
}

