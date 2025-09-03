package remaining_topics.stringconversions;


import java.io.*;
import java.math.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.Base64;

public class StringConversionExamples {

    public static void main(String[] args) throws Exception {


        int i = Integer.parseInt("12");
        float f = Float.parseFloat("12.0");
        double d = Double.parseDouble("1.47");
        boolean b1 = Boolean.parseBoolean("False");
        boolean b2 = Boolean.parseBoolean("True");
        long l = Long.parseLong("47");
        BigInteger bigInt = new BigInteger("21");
        BigDecimal bigDec = new BigDecimal("17.21455");

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }


        byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
        String str = new String(bytes, StandardCharsets.UTF_8);


        byte[] input = "Hello India".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(input);
        byte[] decoded = Base64.getDecoder().decode(encoded);
        System.out.println("Base64 Encoded: " + encoded);
        System.out.println("Base64 Decoded: " + new String(decoded));


        String s1 = String.valueOf(42);
        String s2 = 10 + "";
        Date date = new Date();
        String s3 = date.toString();


        InputStream in = new ByteArrayInputStream("India Zindabad".getBytes());
        String readStr = readString(in);
        System.out.println("Read from InputStream: " + readStr);
    }

    public static String readString(InputStream input) throws IOException {
        byte[] bytes = new byte[50];
        input.read(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
