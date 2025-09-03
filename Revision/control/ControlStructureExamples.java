package remaining_topics.control;

import java.util.*;

public class ControlStructureExamples {

    public static void main(String[] args) {
        switchExample();
        doWhileExample();
        forEachExample();
        continueExample();
        ifElseExample();
        forLoopExample();
        ternaryExample();
        tryCatchFinallyExample();
        breakExample();
        whileLoopExample();
        nestedLabelExample();
    }


    static void switchExample() {
        String name = "Tilak";
        switch (name) {
            case "Sumit":
                System.out.println("Hello Sumit");
                break;
            case "Mahendra":
                System.out.println("Hello Mahendra");
                break;
            case "Tilak":
                System.out.println("Hello Tilak");
                break;
            default:
                System.out.println("Hello Guest");
        }
    }


    static void doWhileExample() {
        int i = 0;
        do {
            System.out.println("doWhile count: " + i);
            i++;
        } while (i < 3);
    }


    static void forEachExample() {
        List<String> names = Arrays.asList("Rohan", "Tez", "Rajeshwari");
        for (String name : names) {
            System.out.println("forEach: " + name);
        }
    }


    static void continueExample() {
        String[] names = {"Mahendra", "Sumit", "Rajeshwari", "Tilak"};
        for (String name : names) {
            if (name.equals("Rajeshwari")) continue;
            System.out.println("continueExample: " + name);
        }
    }


    static void ifElseExample() {
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }


    static void forLoopExample() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("forLoop Roll No: " + i);
        }
    }


    static void ternaryExample() {
        int age = 22;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary: " + category);
    }


    static void tryCatchFinallyExample() {
        String input = "Mahendra123";
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: " + input);
        } finally {
            System.out.println("Finally block executed");
        }
    }


    static void breakExample() {
        String[] names = {"Tilak", "Sumit", "Tez", "Rohan"};
        for (String name : names) {
            if (name.equals("Tez")) break;
            System.out.println("breakExample: " + name);
        }
    }


    static void whileLoopExample() {
        int i = 0;
        while (i < 3) {
            System.out.println("whileLoop count: " + i);
            i++;
        }
    }


    static void nestedLabelExample() {
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 1 && j == 1) break outer;
                System.out.println("nestedLoop: i=" + i + ", j=" + j);
            }
        }
    }
}
