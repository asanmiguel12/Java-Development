package ClassesExercises;

import java.util.Arrays;
import java.util.Scanner;

public class VehicleInventory {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        Vehicle vehicle2 = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        Vehicle vehicle3 = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        Vehicle vehicle4 = new Vehicle(101124,"Honda Civic","White",70000,7500);
        Vehicle vehicle5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        Vehicle vehicle6 = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        Vehicle [] vehicleList = {vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6};

        for (int i = 0; i < vehicleList.length; i++) {
            System.out.println(i);
        }
    }
}
