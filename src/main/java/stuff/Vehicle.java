package stuff;

import java.util.ArrayList;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    // private ArrayList<All> vehicles = new ArrayList<>();


    public Vehicle(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;


    }

    public void run() {
        System.out.println(manufacturer + " " + model + " blazing the way forward!");
    }

    public String getName() {
        String name = type + ": " + manufacturer + " " + model;
        return name;
    }

    public String getEngine() {
        String name = type + ": " + manufacturer + " " + model;
        return name;
    }

    // protected void thinkTwice() {
        
    // }
    
}

