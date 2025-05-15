package Creational_design_pattern.Prototype_design_pattern;

public interface Document extends Cloneable {
    Document clone();
    void print();
}

