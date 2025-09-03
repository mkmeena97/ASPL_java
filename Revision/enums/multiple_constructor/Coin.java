package remaining_topics.enums.multiple_constructor;

public enum Coin {
    PENNY(1, true), NICKEL(5, false), DIME(10), QUARTER(25);

    private final int value;
    private final boolean isCopperColored;

    // Constructor 1
    Coin(int value) {
        this(value, false);
    }

    // Constructor 2
    Coin(int value, boolean isCopperColored) {
        this.value = value;
        this.isCopperColored = isCopperColored;
    }
}
