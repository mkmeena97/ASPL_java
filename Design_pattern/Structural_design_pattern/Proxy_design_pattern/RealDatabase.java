package Design_pattern.Structural_design_pattern.Proxy_design_pattern;

// Real Subject
public class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
