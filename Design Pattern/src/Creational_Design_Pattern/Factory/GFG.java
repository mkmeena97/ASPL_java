package Creational_Design_Pattern.Factory;

public class GFG {
    public static void main(String[] args){
        VechicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vechicle twoWheeler = twoWheelerClient.getpVechicle();
        twoWheeler.printVechicle();

        VechicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client FourWheelerCLient = new Client(fourWheelerFactory);
        Vechicle fourWheeler = fourWheelerFactory.CreateVechicle();
        fourWheeler.printVechicle();

    }
}
