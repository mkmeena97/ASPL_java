package Structural_design_pattern.Proxy_design_pattern;

public class ProxyDatabaseDemo {
    public static void main(String[] args) {
        Database adminDb = new DatabaseProxy("admin");
        Database guestDb = new DatabaseProxy("guest");

        System.out.println("Admin tries to delete:");
        adminDb.query("DELETE FROM users");

        System.out.println("\nGuest tries to delete:");
        guestDb.query("DELETE FROM users");

        System.out.println("\nGuest tries to select:");
        guestDb.query("SELECT * FROM users");
    }
}

