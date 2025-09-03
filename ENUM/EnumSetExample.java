import java.util.EnumSet;

public class EnumSetExample {
    enum SeatFeature {
        RECLINER,
        THREE_D_GLASS,
        VIP_SERVICE,
        FOOD_INCLUDED,
        EXTRA_LEGROOM,
    }

    static class Seat {
        String seatNumber;
        EnumSet<SeatFeature> features;

        Seat(String seatNumber, EnumSet<SeatFeature> features) {
            this.seatNumber = seatNumber;
            this.features = features;
        }

        public void displayInfo() {
            System.out.println("Seat " + seatNumber + " has: " + features);
        }
    }

    public static void main(String[] args) {
        Seat s1 = new Seat("A1", EnumSet.of(
            SeatFeature.RECLINER, SeatFeature.FOOD_INCLUDED));

        Seat s2 = new Seat("B3", EnumSet.of(
            SeatFeature.RECLINER, SeatFeature.VIP_SERVICE, SeatFeature.EXTRA_LEGROOM));

        Seat s3 = new Seat("C5", EnumSet.noneOf(SeatFeature.class)); // no extras

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}

