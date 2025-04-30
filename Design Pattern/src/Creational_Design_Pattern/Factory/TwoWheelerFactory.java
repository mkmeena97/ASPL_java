package Creational_Design_Pattern.Factory;

public class TwoWheelerFactory implements VechicleFactory{
    @Override
    public Vechicle CreateVechicle() {
        return new TwoWheeler();
    }
}
