package remaining_topics.enums.asclass;

public class Coin {
    public static final Coin PENNY = new Coin(1);
    public static final Coin NICKEL = new Coin(5);
    public static final Coin DIME = new Coin(10);
    public static final Coin QUARTER = new Coin(25);

    private int value;

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
