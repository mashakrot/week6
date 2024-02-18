package stuff;

import java.util.ArrayList;
import stuff.Engine;


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
        String name = type + ": " + manufacturer + " " + model + "kw";
        return name;
    }

    public String getTopSpeed() {
        String name = "Top speed: " + Integer.toString(maxSpeed) + "km/h";
        return name;
    }

    public String printEngine(Vehicle vehicle) {
        int i = 0;
        if (vehicle.type == "Car") {
            i = 1;
        } else if (vehicle.type == "Plane") {
            i = 2;
        } else if (vehicle.type == "Ship") {
            i = 3;
        }

        switch (i) {
            case 1:
                Engine carEn = new Engine("V8", 300);

                String carEnName = carEn.getEnName();
                return carEnName;
            case 2:
                Engine planeEn = new Engine("Jet engine", 500);

                String planeEnName = planeEn.getEnName();
                return planeEnName;
            case 3:
                Engine shipEn = new Engine("Wärtsilä Super", 1000);

                String shipEnName = shipEn.getEnName();
                return shipEnName;
            default:
                return "Invalid result";
        }
    }          
    
}

