package Behavioral_Design_Pattern.Observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class EmployeeStatus implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String employeeName;
    private String status;

    public EmployeeStatus(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println(employeeName + "'s status changed to: " + status);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(employeeName, status);
        }
    }
}
