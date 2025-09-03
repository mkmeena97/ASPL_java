package remaining_topics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexExamples {
    public static void main(String[] args) {

        String input1 = "Name: Tilak, Age: 25";
        Pattern pattern1 = Pattern.compile("Name: (\\w+), Age: (\\d+)");
        Matcher matcher1 = pattern1.matcher(input1);
        if (matcher1.find()) {
            System.out.println(matcher1.group(1));
            System.out.println(matcher1.group(2));
        }

        String input2 = "HELLO world";
        Pattern pattern2 = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(input2);
        if (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        String input3 = "Price is $100";
        Pattern pattern3 = Pattern.compile("\\$\\d+");
        Matcher matcher3 = pattern3.matcher(input3);
        if (matcher3.find()) {
            System.out.println(matcher3.group());
        }

        String input4 = "apple orange banana";
        Pattern pattern4 = Pattern.compile("\\b(?!orange)\\w+\\b");
        Matcher matcher4 = pattern4.matcher(input4);
        while (matcher4.find()) {
            System.out.println(matcher4.group());
        }

        String input5 = "I love Java programming";
        Pattern pattern5 = Pattern.compile("Java");
        Matcher matcher5 = pattern5.matcher(input5);
        if (matcher5.find()) {
            System.out.println(matcher5.group());
        }

        String input6 = "C:\\Users\\Tilak";
        Pattern pattern6 = Pattern.compile("C:\\\\Users\\\\Tilak");
        Matcher matcher6 = pattern6.matcher(input6);
        if (matcher6.find()) {
            System.out.println(matcher6.group());
        }

        String input7 = "Java is awesome. I love JavaScript and Java.";
        Pattern pattern7 = Pattern.compile("\\bJava\\b");
        Matcher matcher7 = pattern7.matcher(input7);
        while (matcher7.find()) {
            System.out.println(matcher7.group());
        }
    }
}
