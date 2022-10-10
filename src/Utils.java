import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public final class Utils {
    static Scanner keyboard = new Scanner(System.in);

    public static Vehicle initiateVehicle() {
        System.out.print("Brand: ");
        String brand = keyboard.nextLine();

        System.out.print("Factory: ");
        String factory = keyboard.nextLine();

        System.out.print("Color: ");
        String color = keyboard.nextLine();

        System.out.print("Passengers number: ");
        int passengerNum = inputAndValidatePositiveInt();

        // I need to validate the date too


        LocalDate date = inputAndValidateDate();

        System.out.print("ID: ");
        int idPlate = inputAndValidatePositiveInt();

        System.out.print("Tires number: ");
        int tiresNum = inputAndValidatePositiveInt();

        ArrayList tiresSerialNum = new ArrayList<Integer>();
        System.out.println("Enter the serial number for each tire:  ");
        System.out.print("\t");
        for (int i = 0; i < tiresNum; i++) {
            int sNum = inputAndValidatePositiveInt();
            tiresSerialNum.add(sNum);
        }

        System.out.print("Horsepower: ");
        int horsePower = inputAndValidatePositiveInt();

        Vehicle vehicle = new Vehicle(brand, factory, color, passengerNum, date, idPlate, tiresSerialNum, horsePower);

        return vehicle;
    }
    
    public static RaceCar initiateRaceCar() {
        Vehicle vehicle = initiateVehicle();

        System.out.println("Pickup time: ");
        int pickupTime = inputAndValidatePositiveInt();

        System.out.println("Is Turbo available? ");
        System.out.print("[y] for yes / [n] for no:  ");
        String[] inputList = {"n", "y"};
        String input = inputAndValidateString(null, inputList);

        boolean isTurbo = false;
        if (input == "y") isTurbo = true;

        RaceCar car = new RaceCar(
                                    vehicle.getBrand(), 
                                    vehicle.getFactory(), 
                                    vehicle.getColor(), 
                                    vehicle.getPassengersNumber(), 
                                    vehicle.getBuyingDate(), 
                                    vehicle.getIdPlate(), 
                                    vehicle.getTiresNumber(), 
                                    vehicle.getHorsePower(), 
                                    pickupTime, 
                                    isTurbo
                                );

        return car;
    }

    public static ConvertibleCar initiateConvertibleCar() {
        Vehicle vehicle = initiateVehicle();

        System.out.print("Pickup time: ");
        int pickupTime = inputAndValidatePositiveInt();

        System.out.print("The number of doors: ");
        int doorsNum = inputAndValidatePositiveInt();

        ConvertibleCar car = new ConvertibleCar(
                                    vehicle.getBrand(), 
                                    vehicle.getFactory(), 
                                    vehicle.getColor(), 
                                    vehicle.getPassengersNumber(), 
                                    vehicle.getBuyingDate(), 
                                    vehicle.getIdPlate(), 
                                    vehicle.getTiresNumber(), 
                                    vehicle.getHorsePower(), 
                                    pickupTime, 
                                    doorsNum
                                );

        return car;
    }

    public static MotorBike initiateMotorBike() {
        Vehicle vehicle = initiateVehicle();

        MotorBike motorBike = new MotorBike(
                                    vehicle.getBrand(), 
                                    vehicle.getFactory(), 
                                    vehicle.getColor(), 
                                    vehicle.getPassengersNumber(), 
                                    vehicle.getBuyingDate(), 
                                    vehicle.getIdPlate(), 
                                    vehicle.getTiresNumber(), 
                                    vehicle.getHorsePower()
                                );

        return motorBike;
    }

    public static Airplane initiateAirplane() {
        Vehicle vehicle = initiateVehicle();

        System.out.print("The number of engines: ");
        int enginesNum = inputAndValidatePositiveInt();

        System.out.print("Max altitude: ");
        int maxAltitude = inputAndValidatePositiveInt();

        Airplane airplane = new Airplane(
                                    vehicle.getBrand(), 
                                    vehicle.getFactory(), 
                                    vehicle.getColor(), 
                                    vehicle.getPassengersNumber(), 
                                    vehicle.getBuyingDate(), 
                                    vehicle.getIdPlate(), 
                                    vehicle.getTiresNumber(), 
                                    vehicle.getHorsePower(),
                                    enginesNum,
                                    maxAltitude
                                );

        return airplane;
    }

    // Input validation functions
    public static int inputAndValidatePositiveInt() {
        int input;

        do {
            input = keyboard.nextInt();

            if (input < 0) System.out.println("Invalid input! Try again: ");

        } while(input < 0);

        return input;
    }

    // private static int validateIdPlate() {
    //     int input;
    //     boolean inputValid = false;

    //     do {
    //         input = keyboard.nextInt();

    //         if (input < 100000000 || input > 999999999) {
    //             System.out.println("Invalid input! Try again: ");
    //         }
    //         else {
    //             inputValid = true;
    //             break;
    //         }

    //     } while(!inputValid);
        
    //     return input;
    // }

    private static String inputAndValidateString(String input, String[] inputList) {
        boolean inputExist = false;

        do {  
            if (input != null) {
                input = input.toLowerCase();

                for (int i = 0; i < inputList.length; i++) {
                    if (input == inputList[i]) {
                        inputExist = true;
                        break;
                    }
                }
            } 

            if (!inputExist) {
                if (input != null) System.out.println("Invalid input! Try again: ");
                input = keyboard.nextLine();
            }

            if (input != null && Arrays.asList(inputList).contains(input)) inputExist = true;

        } while(!inputExist);
        
        return input;
    }

    public static LocalDate inputAndValidateDate() {
        LocalDate buyingDate = LocalDate.now();
        boolean dateIsCorrect = true;
        int year;
        int month;
        int day;

        do {
            try {
                System.out.print("Buying date: ");
                System.out.print("Year - ");
                year = keyboard.nextInt();
                System.out.print("Month - ");
                month = keyboard.nextInt();
                System.out.print("Day - ");
                day = keyboard.nextInt();

                buyingDate = LocalDate.of(year, month, day);
                dateIsCorrect = true;
            } catch (Exception e) {
                System.out.println("Wrong date! try again: ");
                dateIsCorrect = false;
            }

        } while (!dateIsCorrect);


        return buyingDate;
    }

    public static int inputAndValidateMaxIntLimit(int maxInput) {
        int input;

        do {
            input = Utils.inputAndValidatePositiveInt();

            if (input > maxInput) {
                System.out.print("Input exceeded limits of " + maxInput + " try again!  ");
            }

        } while (input > maxInput);

        return input;
    }
}
