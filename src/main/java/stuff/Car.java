package stuff;

public class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed) {
        super("Car", manufacturer, model, maxSpeed);
    }

    public void drive() {
        System.out.println(manufacturer + " " + model + " blazing the way forward!");   
    }

}
