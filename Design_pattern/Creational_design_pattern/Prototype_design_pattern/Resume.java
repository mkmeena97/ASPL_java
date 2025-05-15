package Creational_design_pattern.Prototype_design_pattern;

public class Resume implements Document {
    private String name;
    private String content;

    public Resume(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public Resume clone() {
        return new Resume(this.name, this.content); // deep copy
    }

    @Override
    public void print() {
        System.out.println("Resume of " + name);
        System.out.println("Content: " + content);
    }

    public void setName(String name) {
        this.name = name;
    }
}

