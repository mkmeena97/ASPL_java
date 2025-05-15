package Behavioral_Design_Pattern.Interpreter_design_pattern;

import java.util.Stack;

// Client
public class InterpreterMathDemo {
    public static void main(String[] args) {
        String input = "5 3 + 2 -";  // Equivalent to: (5 + 3) - 2
        Expression expression = ExpressionParser.parse(input);
        int result = expression.interpret();

        System.out.println("Expression: " + input);
        System.out.println("Result: " + result);  // Output: 6
    }
}

