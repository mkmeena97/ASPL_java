package Behavioral_Design_Pattern.Interpreter_design_pattern;

// Non-Terminal Expressions
public class AddExpression implements Expression {
    private Expression left, right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
