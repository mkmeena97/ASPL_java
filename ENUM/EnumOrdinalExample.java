public class EnumOrdinalExample {
    enum Coin {
        PENNY, NICKEL, DIME, QUARTER
    }

    public static void main(String[] args) {
        for (Coin coin : Coin.values()) {
            System.out.println(coin + " => ordinal: " + coin.ordinal());
        }
    }
}

