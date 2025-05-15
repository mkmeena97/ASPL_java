package Structural_design_pattern.Flyweight_design_pattern;

import java.util.HashMap;
import java.util.Map;

// Client
public class FlyweightDemo {
    public static void main(String[] args) {
        String document = "HELLO";
        String font = "Arial";

        for (int i = 0; i < document.length(); i++) {
            char c = document.charAt(i);
            Character character = CharacterFactory.getCharacter(c, font);
            character.display(i);
        }
    }
}

