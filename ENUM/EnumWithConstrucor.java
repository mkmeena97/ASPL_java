enum Coin {
    PENNY(1, true),
    NICKEL(5, false),
    DIME(10),
    QUARTER(25);

    private final int value;
    private final boolean isCopperColored;

    // Constructor with one argument calls the other
    Coin(int value) {
        this(value, false);  // default copper color = false
    }

    Coin(int value, boolean isCopperColored) {
        this.value = value;
        this.isCopperColored = isCopperColored;
    }

    public int getValue() {
        return value;
    }

    public boolean isCopperColored() {
        return isCopperColored;
    }
}

public class EnumWithConstrucor {
    public static void main(String[] args) {
        for (Coin c : Coin.values()) {
            System.out.println(c.name() + " = " + c.getValue()
                    + ", Copper Colored: " + c.isCopperColored());
        }
    }
}

