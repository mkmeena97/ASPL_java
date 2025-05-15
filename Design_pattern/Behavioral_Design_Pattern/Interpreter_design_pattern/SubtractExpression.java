package Behavioral_Design_Pattern.Interpreter_design_pattern;

public class SubtractExpression implements Expression {
    private Expression left, right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
