package Mod01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PayRollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            FileReader employees = new FileReader("DataFiles/" + "employees.csv");
            BufferedReader bufReader = new BufferedReader(employees);

            String input = bufReader.readLine();

            while ((input = bufReader.readLine()) != null) {
                String[] inputformatted = input.split("\\|");
                Employee employee1 = new Employee(Double.parseDouble(inputformatted[0]), inputformatted[1], Double.parseDouble(inputformatted[2]), Double.parseDouble(inputformatted[3]));

                System.out.println("Employee: " + employee1.getEmployeeId() + " Name: " + employee1.getName() + " Gross Pay: $" + employee1.getGrosspay());
            }  bufReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}