package remaining_topics.enums;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;
    public Direction getOpposite(){
        switch (this){
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case WEST:
                return EAST;
            case EAST:
                return WEST;
            default: //This will never happen
                return null;
        }
    }
}
enum Direction2 {
    NORTH, SOUTH, EAST, WEST;

    private Direction2 opposite;

    public Direction2 getOpposite(){
        return opposite;
    }

    static {
        NORTH.opposite = SOUTH;
        SOUTH.opposite = NORTH;
        WEST.opposite = EAST;
        EAST.opposite = WEST;
    }
}