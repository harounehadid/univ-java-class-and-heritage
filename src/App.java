import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // LocalDate date = LocalDate.of(2015, 6, 23);
        // ArrayList arr = new ArrayList<>();
        // arr.add(4);

        // System.out.println("Enter your name: ");

        // String name = keyboard.nextLine();
        // System.out.println("Hello sir " + name + "!");

        // Vehicle vehicle = new Vehicle(
        //     "Porche", "VW", "white", 2, date, 01007, arr, 580
        // );

        // System.out.println(vehicle.calculatePeriod());;
        // vehicle.displayVehicleInfo();

        Scanner keyboard = new Scanner(System.in);
        ArrayList vehicles = new ArrayList<>();

        System.out.println("-------------- Welcome ---------------");
        System.out.println("How many vehicles you want to Add? ");
        int vehicleNum = keyboard.nextInt();

        if (vehicleNum == 0) {
            System.out.println("\nNo vehicles to be added!");
            return;
        }

        System.out.println("How many cars? ");
        int carsNum = keyboard.nextInt();

        if (carsNum == vehicleNum) {
            return;
        }

        System.out.println("How many motor bikes? ");
        int motorBikesNum = keyboard.nextInt();

        if ((carsNum + motorBikesNum) == vehicleNum) {
            return;
        }

        System.out.println("How many airplanes? ");
        int airplanesNum = keyboard.nextInt();

        System.out.println("\n---------------------------------\n");
        
        if (carsNum > 0) {
            System.out.println("Enter the information related to the cars");

            for (int i = 0; i < carsNum; i++) {
                System.out.println("Car number " + i);
            }
        }
    }
}