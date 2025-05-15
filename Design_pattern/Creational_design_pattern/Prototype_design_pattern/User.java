package Creational_design_pattern.Prototype_design_pattern;

public class User {
    public static void main(String[] args) {
        // Create and register prototypes
        DocumentRegistry registry = new DocumentRegistry();

        Resume resumeTemplate = new Resume("Default", "Full Stack Developer Resume Template");
        Report reportTemplate = new Report("Monthly Report", "Summary of monthly activities");

        registry.addPrototype("resume", resumeTemplate);
        registry.addPrototype("report", reportTemplate);

        // Clone and customize
        Resume myResume = (Resume) registry.getClone("resume");
        myResume.setName("Mahendra");
        myResume.print();

        Report myReport = (Report) registry.getClone("report");
        myReport.setTitle("May Report");
        myReport.print();

        // Verify that they are distinct instances
        System.out.println("Same object? " + (myResume == resumeTemplate)); // false
        System.out.println("Same object? " + (myReport == reportTemplate)); // false
    }
}

