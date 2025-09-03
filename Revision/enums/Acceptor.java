<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.util.function.Predicate;

public enum Acceptor implements Predicate<String> {
    NULL {
        @Override
        public boolean test(String s) {
            return s == null;
        }
    },
    EMPTY {
        @Override
        public boolean test(String s) {
            return s.equals("");
        }
    },
    NULL_OR_EMPTY {
        @Override
        public boolean test(String s) {
            return NULL.test(s) || EMPTY.test(s);
        }
    };
}
