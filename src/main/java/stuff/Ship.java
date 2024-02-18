package stuff;

public class Ship extends Vehicle {
    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Ship", manufacturer, model, maxSpeed);
    }
    
    public void sail() {
        System.out.println(manufacturer + " " + model + " sail to the ends of the seas!");
    }
}
