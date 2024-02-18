package stuff;

import java.util.ArrayList;

public class All {
    // private String type;
    // private String manufacturer;
    // private String model;
    // private int maxSpeed;
    private ArrayList<Vehicle> vehiclesList = new ArrayList<>();


    // public All(String type, String manufacturer, String model, int maxSpeed) {

    // }

    public void addVehicle(Vehicle vehicle) {
        vehiclesList.add(vehicle);
    }

    public void listVechicles() {
        // int i = 0;
        for (Vehicle vehicle: vehiclesList) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.printEngine(vehicle));
            System.out.println(vehicle.getTopSpeed());
            System.out.println("");
        }
    }
}

