enum Season {
    WINTER("Cold"), SUMMER("Hot"), MONSOON("Rainy");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class MethodEnumExample {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s + ": " + s.getDescription());
        }
    }
}

