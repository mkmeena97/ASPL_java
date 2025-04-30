package Creational_Design_Pattern.Factory;

public class FourWheelerFactory implements VechicleFactory {

    @Override
    public Vechicle CreateVechicle() {
        return new FourWheeler();
    }
}
