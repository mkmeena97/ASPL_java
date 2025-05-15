package Structural_design_pattern.Proxy_design_pattern;

class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.userRole = userRole;
        this.realDatabase = new RealDatabase();
    }

    @Override
    public void query(String sql) {
        if (checkAccess(sql)) {
            realDatabase.query(sql);
        } else {
            System.out.println("Access denied for user role: " + userRole);
        }
    }

    private boolean checkAccess(String sql) {
        // Only admins can run delete queries for example
        if (userRole.equalsIgnoreCase("admin")) {
            return true;
        }
        if (sqlIsSafe(sql)) {
            return true;
        }
        return false;
    }

    private boolean sqlIsSafe(String sql) {
        // Very simple check — disallow DELETE queries for non-admins
        return !sql.toLowerCase().startsWith("delete");
    }
}
