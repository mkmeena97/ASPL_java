<<<<<<< HEAD
package remaining_topics.enums.multiple_constructor;
=======
package Revision.enums.multiple_constructor;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

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
