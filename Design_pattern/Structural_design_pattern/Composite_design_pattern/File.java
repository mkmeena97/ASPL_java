package Structural_design_pattern.Composite_design_pattern;

public class File implements FileSystemItem {
    private String name;
    private int size; // size in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + "KB)");
    }
}
