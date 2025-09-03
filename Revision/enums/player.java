<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

class Coordinates {
    private int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coordinates)) return false;
        Coordinates other = (Coordinates) obj;
        return this.x == other.x && this.y == other.y;
    }
}

class Player {
    private boolean attacking;
    private boolean hasWeapon;
    private Coordinates coordinates;

    public Player(boolean attacking, boolean hasWeapon, Coordinates coordinates) {
        this.attacking = attacking;
        this.hasWeapon = hasWeapon;
        this.coordinates = coordinates;
    }

    public boolean isAttacking() {
        return attacking;
    }

    public boolean hasWeapon() {
        return hasWeapon;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
