package Behavioral_Design_Pattern.Interpreter_design_pattern;

// Terminal Expression
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
