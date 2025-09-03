package remaining_topics.enums;

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
