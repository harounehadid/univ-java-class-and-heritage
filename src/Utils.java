import java.time.LocalDate;
import java.util.Scanner;

public final class Utils {
    static Scanner keyboard = new Scanner(System.in);

    private static Vehicle initiateVehicle() {
        System.out.println("Brand: ");
        String brand = keyboard.nextLine();

        System.out.println("Factory: ");
        String factory = keyboard.nextLine();

        System.out.println("Color: ");
        String color = keyboard.nextLine();

        System.out.println("Passengers number: ");
        int passengerNum = keyboard.nextInt();

        System.out.println("Buying date: ");
        System.out.println("Year ");
        int year = keyboard.nextInt();
        System.out.println("Month ");
        int month = keyboard.nextInt();
        System.out.println("Day ");
        int day = keyboard.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("ID: ");
        int idPlate = keyboard.nextInt();

        System.out.println("Tires number: ");
        int tiresNum = keyboard.nextInt();

        System.out.println("Horsepower: ");
        int horsepower = keyboard.nextInt();

        Vehicle vehicle = new Vehicle(brand, factory, color, passengerNum, date, idPlate, tiresNum, horsepower);

        return vehicle;
    }
    
    public static RaceCar initiateRaceCar() {
        

        return null;
    }
}
