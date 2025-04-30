package Creational_Design_Pattern.Factory;

public class Client {
    private Vechicle pVechicle;

    public Client (VechicleFactory factory){
        pVechicle = factory.CreateVechicle();
    }

    public Vechicle getpVechicle(){
        return pVechicle ;
    }

}
