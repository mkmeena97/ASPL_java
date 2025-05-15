package Creational_design_pattern.Prototype_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private final Map<String, Document> prototypes = new HashMap<>();

    public void addPrototype(String key, Document doc) {
        prototypes.put(key, doc);
    }

    public Document getClone(String key) {
        Document prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}

