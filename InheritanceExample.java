// Parent Class (Base Class)
class TechDevice {
    String brand;
    int price;

    // Constructor
    public TechDevice(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Common method
    public void deviceInfo() {
        System.out.println("Brand: " + brand + ", Price: $" + price);
    }
}

// Child Class (Derived Class)
class Smartphone extends TechDevice {
    String os;

    // Constructor
    public Smartphone(String brand, int price, String os) {
        super(brand, price);
        this.os = os;
    }

    // Additional method
    public void showOS() {
        System.out.println("Operating System: " + os);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Apple", 1200, "iOS");
        phone.deviceInfo(); // Inherited from TechDevice
        phone.showOS();     // Specific to Smartphone
    }
}

