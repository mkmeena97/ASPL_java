<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25); // usual names for US coins
    // note that the above parentheses and the constructor arguments match
    private int value;
    Coin(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    // Avoid this
    public void setValue(int value) {
        this.value = value;
    }
}
class Main1{
    public static void main(String[] args) {
        int p = Coin.NICKEL.getValue();
        System.out.println(p);
    }

}