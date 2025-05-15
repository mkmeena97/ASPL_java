package Creational_design_pattern.Prototype_design_pattern;

public class Report implements Document {
    private String title;
    private String body;

    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public Report clone() {
        return new Report(this.title, this.body);
    }

    @Override
    public void print() {
        System.out.println("Report: " + title);
        System.out.println("Body: " + body);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

