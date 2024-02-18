package main;

import stuff.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

import stuff.All;
import stuff.Car;
import stuff.Plane;
import stuff.Ship;
import stuff.Engine;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Vehicle newVehicle = null;
        // Car car = null;
        // Plane plane = null;
        // Ship ship= null;

        boolean exit = true;

        // ArrayList<Vehicle> vehicles = new ArrayList<>();
        All all = new All();

        while (exit) {
            System.out.println("1) Create new vehicle, 2) List vehicles 3) Drive cars, 4) Fly planes, 5) Sail the ships, 0) End the program");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
                
                switch (i) {
                    case 1:
                        System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
                        String typeString = sc.nextLine();
                        int type = Integer.parseInt(typeString);
                        
                        System.out.println("Who is the manufacturer?");
                        String manuf = sc.nextLine();
                        System.out.println("What is the model of the vehicle?");
                        String model = sc.nextLine();
                        System.out.println("What is the top speed?");
                        String  maxSpeedString = sc.nextLine();
                        int maxSpeed = Integer.parseInt(maxSpeedString);
                        
                        
                        if (type == 1 ) {
                            newVehicle = new Car(manuf, model, maxSpeed);
                        } else if (type == 2) {
                            newVehicle = new Plane(manuf, model, maxSpeed);
                        } else if (type == 3) {
                            newVehicle = new Ship(manuf, model, maxSpeed);
                        }

                        all.addVehicle(newVehicle);
                        break;
                    case 2:
                        all.listVechicles();
                        break;
                    case 3:
                        all.makeItMove();
                        break;
                    case 4:
                        all.makeItFly();
                        break;
                    case 5:
                        all.makeItSwim();
                        break;
                    case 0:
                        System.out.println("Thank you for using the program.");
                        exit = false;
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
            }
            }
            
        }
    }
}
