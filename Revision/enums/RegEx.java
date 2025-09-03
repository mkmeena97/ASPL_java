<<<<<<< HEAD
package remaining_topics.enums;
=======
package Revision.enums;
>>>>>>> 254e645d0d81063fc89a08d4215866b14ce70247

import java.util.function.Predicate;
import java.util.regex.Pattern;

enum RegEx implements Predicate<String> {
    UPPER("[A-Z]+"),
    LOWER("[a-z]+"),
    NUMERIC("[+-]?[0-9]+");

    private final Pattern pattern;

    private RegEx(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    @Override
    public boolean test(String input) {
        return pattern.matcher(input).matches();
    }
}
