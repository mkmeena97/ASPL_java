package remaining_topics.enums;

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
