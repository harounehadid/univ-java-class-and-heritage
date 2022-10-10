import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList raceCarsList = new ArrayList<RaceCar>();
        ArrayList convertibleCarsList = new ArrayList<ConvertibleCar>();
        ArrayList motorBikesList = new ArrayList<MotorBike>();
        ArrayList airplaneList = new ArrayList<Airplane>();
        int vehiclesAdded = 0;
        int vehiclesLeft = 0;

        System.out.println("-------------- Welcome ---------------");
        System.out.println("How many vehicles you want to Add? ");
        int vehicleNum = keyboard.nextInt();

        if (vehicleNum == 0) {
            System.out.println("\nNo vehicle to be added!");
            return;
        }

        System.out.println("How many cars? ");
        int carsNum = keyboard.nextInt();

        System.out.println("How many race cars: ");
        int raceCarsNum = keyboard.nextInt();
        int convertibleCarsNum = carsNum - raceCarsNum;
        System.out.println(convertibleCarsNum + " convertibles to create!");

        for (int i = 0; i < raceCarsNum; i++) {
            System.out.println("Enter car's infomation >");
            RaceCar newCar = Utils.initiateRaceCar();
            raceCarsList.add(newCar);
        }

        for (int i = 0; i < convertibleCarsNum; i++) {
            ConvertibleCar newCar = Utils.initiateConvertibleCar();
            convertibleCarsList.add(newCar);
        }

        if (carsNum == vehicleNum) return;

        vehiclesAdded = carsNum;
        vehiclesLeft = vehicleNum - vehiclesAdded;
        System.out.println(vehiclesLeft + " vehicles left to add!");

        System.out.println("How many motor bikes? ");
        int motorBikesNum = keyboard.nextInt();

        for (int i = 0; i < motorBikesNum; i++) {
            System.out.println("Enter Bike's infomation >");
            MotorBike newMotor = Utils.initiateMotorBike();
            motorBikesList.add(newMotor);
        }

        if ((carsNum + motorBikesNum) == vehicleNum) return;

        vehiclesAdded += motorBikesNum;
        vehiclesLeft = vehicleNum - vehiclesAdded;
        System.out.println(vehiclesLeft + " vehicles left to add!");

        System.out.println("How many airplanes? ");
        int airplanesNum = keyboard.nextInt();

        for (int i = 0; i < airplanesNum; i++) {
            System.out.println("Enter car's infomation >");
            Airplane newAirplane = Utils.initiateAirplane();
            airplaneList.add(newAirplane);
        }

        System.out.println("\n---------------------------------\n");

        for (int i = 0; i < raceCarsList.size(); i++) {
            
        }
    }
}