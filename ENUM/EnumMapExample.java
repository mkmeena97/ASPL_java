import java.util.EnumMap;

public class EnumMapExample {
    
    // Enum representing coffee sizes
    enum CoffeeSize {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    // Class to hold details about each size
    static class PriceDetail {
        double price;
        int calories;
        String description;

        public PriceDetail(double price, int calories, String description) {
            this.price = price;
            this.calories = calories;
            this.description = description;
        }

        @Override
        public String toString() {
            return String.format("₹%.2f, %d cal - %s", price, calories, description);
        }
    }

    public static void main(String[] args) {
        // Create the EnumMap
        EnumMap<CoffeeSize, PriceDetail> coffeeMenu = new EnumMap<>(CoffeeSize.class);

        // Add size options with price and info
        coffeeMenu.put(CoffeeSize.SMALL, new PriceDetail(120.0, 90, "Solo shot"));
        coffeeMenu.put(CoffeeSize.MEDIUM, new PriceDetail(150.0, 150, "Standard brew"));
        coffeeMenu.put(CoffeeSize.LARGE, new PriceDetail(180.0, 220, "Double shot delight"));
        coffeeMenu.put(CoffeeSize.EXTRA_LARGE, new PriceDetail(210.0, 300, "Office fuel tank"));

        // Show the full menu
        System.out.println(" Welcome to ASPL Café ");
        System.out.println("Here’s our Coffee Menu:");
        for (CoffeeSize size : coffeeMenu.keySet()) {
            System.out.println(size + " ➜ " + coffeeMenu.get(size));
        }
    }
}

