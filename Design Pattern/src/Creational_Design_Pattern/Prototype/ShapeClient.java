package Creational_Design_Pattern.Prototype;

public class ShapeClient {
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype){
        this.shapePrototype=shapePrototype ;
    }
    public Shape createShape(){
        return shapePrototype.clone();
    }

}
