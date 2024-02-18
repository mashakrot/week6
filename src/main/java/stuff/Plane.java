package stuff;

public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Plane", manufacturer, model, maxSpeed);
    }

    public void fly() {
        System.out.println(manufacturer + " " + model + " flying to the destination!");   
    }
}
