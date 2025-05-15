package Structural_design_pattern.Flyweight_design_pattern;

// Concrete Flyweight
public class ConcreteCharacter implements Character {
    private final char symbol;   // intrinsic state
    private final String font;   // intrinsic state

    public ConcreteCharacter(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void display(int position) {
        System.out.println("Character: '" + symbol + "' with font: " + font + " at position: " + position);
    }
}
