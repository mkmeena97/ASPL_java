<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

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
