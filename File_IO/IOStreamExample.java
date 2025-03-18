package File_IO;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures object compatibility during deserialization
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class IOStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String copyPath = "copy_example.txt";
        String objectFile = "person.dat";

        // 1️ File Handling
        try {
            fileWrite(filePath, "Hello, this is a demonstration of Java I/O Streams!");
            fileRead(filePath);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

        // 2️ Buffered Streams
        try {
            bufferedWrite(filePath, "Buffered writing example.");
            bufferedRead(filePath);
        } catch (IOException e) {
            System.out.println("Buffered Stream Error: " + e.getMessage());
        }

        // 3️ Data Streams
        try {
            dataWrite("data.bin");
            dataRead("data.bin");
        } catch (IOException e) {
            System.out.println("Data Stream Error: " + e.getMessage());
        }

        // 4️ Object Streams (Serialization & Deserialization)
        try {
            serializeObject(objectFile, new Person("John Doe", 30));
            deserializeObject(objectFile);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Object Stream Error: " + e.getMessage());
        }

        // 5️ Byte Streams
        try {
            byteStreamExample("Byte stream example in Java.");
        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }

        // 6️ File Copy using Streams
        try {
            fileCopy(filePath, copyPath);
        } catch (IOException e) {
            System.out.println("File Copy Error: " + e.getMessage());
        }
    }

    // File Handling: Writing & Reading
    public static void fileWrite(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println(" File written successfully.");
        }
    }

    public static void fileRead(String filePath) throws IOException {
        try (FileReader reader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            System.out.println(" File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Buffered Streams: Writing & Reading
    public static void bufferedWrite(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();
            writer.write(content);
            System.out.println(" Buffered writing completed.");
        }
    }

    public static void bufferedRead(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println(" Buffered File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Data Streams: Writing & Reading
    public static void dataWrite(String filePath) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeUTF("DataOutputStream Example");
            dos.writeInt(100);
            dos.writeDouble(99.99);
            System.out.println(" Data written successfully.");
        }
    }

    public static void dataRead(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println(" Data Read:");
            System.out.println("Text: " + dis.readUTF());
            System.out.println("Integer: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
        }
    }

    // Object Streams (Serialization & Deserialization)
    public static void serializeObject(String filePath, Person person) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println(" Object serialized successfully.");
        }
    }

    public static void deserializeObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person person = (Person) ois.readObject();
            System.out.println(" Deserialized Person: " + person.name + ", Age: " + person.age);
        }
    }

    // Byte Streams Example
    public static void byteStreamExample(String content) throws IOException {
        byte[] data = content.getBytes();
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int byteRead;
            while ((byteRead = bis.read()) != -1) {
                bos.write(byteRead);
            }
            System.out.println(" Byte Stream Output: " + bos.toString());
        }
    }

    // File Copy using Streams
    public static void fileCopy(String sourcePath, String destPath) throws IOException {
        try (FileInputStream input = new FileInputStream(sourcePath);
             FileOutputStream output = new FileOutputStream(destPath)) {
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            System.out.println(" File copied successfully.");
        }
    }
}

