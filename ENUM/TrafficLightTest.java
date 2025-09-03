
enum TrafficLight {
    RED, GREEN, YELLOW
}

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.YELLOW;

        switch (light) {
            case RED:
                System.out.println("Stop");
                break;
            case GREEN:
                System.out.println("Go");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
        }
    }
}
