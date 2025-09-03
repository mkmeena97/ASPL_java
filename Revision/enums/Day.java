<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

public class Day {
    private Season season;

    public String getSeason() {
        return season.name();
    }

    public void setSeason(String season) {
        this.season = Season.valueOf(season);
    }


    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL

    }
    public static void display(Season s) {
        System.out.println(s.name());  // name() is a built-in method that gets the exact name of the

    }

    public static void enumIterate() {
        for (Season s : Season.values()) {
            System.out.println(s.name());
        }
    }
    public static void enumSwitchExample(Season s) {
        switch(s) {
            case WINTER:
                System.out.println("It's pretty cold");
                break;
            case SPRING:
                System.out.println("It's warming up");
                break;
            case SUMMER:
                System.out.println("It's pretty hot");
                break;
            case FALL:
                System.out.println("It's cooling down");
                break;
        }
    }


}
