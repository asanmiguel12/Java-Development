package Mod01;

import java.io.*;
import java.util.Scanner;

public class PayRollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
           // prompt user for the name of the file
            System.out.println("Enter the name of the file employee file you would like to read: ");
            String empFileName = scanner.nextLine();
//            System.out.println("Enter the name of the payroll file you want to create: payroll-sept-2023.csv");
//            String chooseFileName = scanner.nextLine();

        try {
            FileReader employees = new FileReader("DataFiles/" + "employees.csv");
            BufferedReader bufReader = new BufferedReader(employees);
            // FileWriter fileWriter = new FileWriter(chooseFileName);
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //List<String> employeeDataList = new ArrayList<>();
            String input = bufReader.readLine();

            while ((input = bufReader.readLine()) != null) {
                String[] inputformatted = input.split("\\|");
                Employee employee1 = new Employee(Double.parseDouble(inputformatted[0]), inputformatted[1], Double.parseDouble(inputformatted[2]), Double.parseDouble(inputformatted[3]));

               // String formattedEmployee = "Employee: " + employee1.getEmployeeId() + " Name: " + employee1.getName() + " Gross Pay: $" + employee1.getGrosspay() ;
                System.out.println("Employee: " + employee1.getEmployeeId() + " Name: " + employee1.getName() + " Gross Pay: $" + employee1.getGrosspay());
                //fileWriter.write(formattedEmployee);
            }
            //fileWriter.close();
            bufReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
