package Structural_design_pattern.Flyweight_design_pattern;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();

    public static Character getCharacter(char symbol, String font) {
        String key = symbol + font;
        if (!characters.containsKey(key)) {
            characters.put(key, new ConcreteCharacter(symbol, font));
        }
        return characters.get(key);
    }
}
