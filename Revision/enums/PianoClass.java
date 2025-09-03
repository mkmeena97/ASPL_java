package remaining_topics.enums;

public enum PianoClass {
    JOHN, BEN, LUKE,

    RITA {
        @Override
        public String getSex() {
            return "Female";
        }
    },

    TOM {
        @Override
        public String getLevel() {
            return "Intermediate";
        }
    };

    public String getSex() {
        return "Male";
    }

    public String getLevel() {
        return "Beginner";
    }
}
