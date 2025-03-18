package File_IO;

import java.io.*;
import java.nio.file.*;

public class FileIOExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String content = "Hello, this is a test file!";

        // 1. File Class Operations
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            }
            System.out.println("File exists: " + file.exists());
            System.out.println("File size: " + file.length() + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Writing to a File using FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Reading from a File using FileReader
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("Reading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Using BufferedWriter to Append Data
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("This is appended text.");
            System.out.println("Appended data successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. Using FileInputStream & FileOutputStream for Byte Stream Operations
        try (FileOutputStream fos = new FileOutputStream("binary.dat");
             FileInputStream fis = new FileInputStream("binary.dat")) {
            fos.write(65); // Writing ASCII value of 'A'
            fos.write(66);
            fos.write(67);
            System.out.println("Binary data written.");

            System.out.println("Reading binary data:");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6. RandomAccessFile Example
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            randomAccessFile.seek(5);
            randomAccessFile.writeBytes("INSERT");
            System.out.println("Random access write completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 7. Using Java NIO Files API
        try {
            Path path = Paths.get(filePath);
            System.out.println("File content using NIO: " + Files.readString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}  

