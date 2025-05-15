package Behavioral_Design_Pattern.Observer_design_pattern;

// Subject Interface
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
