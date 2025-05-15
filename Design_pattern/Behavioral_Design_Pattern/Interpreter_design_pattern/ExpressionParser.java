package Behavioral_Design_Pattern.Interpreter_design_pattern;

import java.util.Stack;

// Interpreter (Parser)
public class ExpressionParser {
    public static Expression parse(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Expression> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression result = getOperatorInstance(token, left, right);
                stack.push(result);
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    private static Expression getOperatorInstance(String op, Expression left, Expression right) {
        return switch (op) {
            case "+" -> new AddExpression(left, right);
            case "-" -> new SubtractExpression(left, right);
            default -> throw new IllegalArgumentException("Unsupported operation: " + op);
        };
    }
}
