package remaining_topics.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) throws FileNotFoundException {



        Scanner scanner1 = new Scanner("Tilak Mahendra Rajeshwari");
        while (scanner1.hasNext()) {
            String name = scanner1.next();
            System.out.println("Name: " + name);
        }
        scanner1.close();



        String csv = "Tilak,Sumit,Mahendra,Tez,Rohan";
        Scanner scanner2 = new Scanner(csv);
        scanner2.useDelimiter(",");
        while (scanner2.hasNext()) {
            System.out.println("CSV Name: " + scanner2.next());
        }
        scanner2.close();


        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner3.nextLine();
        System.out.println("You entered: " + fullName);

        File file = new File("input.txt");
        if (file.exists()) {
            Scanner scanner4 = new Scanner(file);
            while (scanner4.hasNextLine()) {
                System.out.println("File Line: " + scanner4.nextLine());
            }
            scanner4.close();
        } else {
            System.out.println("File not found: input.txt");
        }


        System.out.println("\n--- 78.5: Read full input as String ---");
        System.out.print("Type something (end with Ctrl+D or Ctrl+Z): ");
        Scanner scanner5 = new Scanner(System.in).useDelimiter("\\A");
        if (scanner5.hasNext()) {
            String allInput = scanner5.next();
            System.out.println("Full Input: " + allInput);
        }



        System.out.println("\n--- 78.6: Closing Scanner Carefully ---");
        scanner3.close();
        System.out.println("Scanners closed properly.");


        System.out.println("\n--- 78.7: Reading Integer ---");
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        if (scanner6.hasNextInt()) {
            int age = scanner6.nextInt();
            System.out.println("Your age is: " + age);
        } else {
            System.out.println("That's not a valid integer!");
        }
        scanner6.close();
    }
}
