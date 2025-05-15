package Structural_design_pattern.Composite_design_pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("resume.pdf", 120);
        File file2 = new File("photo.png", 340);
        File file3 = new File("project.zip", 1024);

        Folder documents = new Folder("Documents");
        Folder images = new Folder("Images");

        documents.addItem(file1);
        images.addItem(file2);

        Folder mainFolder = new Folder("MyDrive");
        mainFolder.addItem(documents);
        mainFolder.addItem(images);
        mainFolder.addItem(file3);

        mainFolder.showDetails();
    }
}
