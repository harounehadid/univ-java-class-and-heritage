import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
        int vehiclesLeft = 0;

        System.out.println("-------------- Welcome ---------------");
        System.out.print("How many vehicles you want to Add? ");
        int vehicleNum = Utils.inputAndValidatePositiveInt();

        if (vehicleNum == 0) {
            System.out.println("\nNo vehicle to be added!");
            return;
        }

        // Dealing with how much vehicles gonna be added
        vehiclesLeft = vehicleNum;

        int raceCarsNum = 0;
        int convertibleCarsNum = 0;
        int motorBikesNum = 0;
        int airplanesNum = 0;

        System.out.print("How many race cars? ");
        raceCarsNum = Utils.inputAndValidateMaxIntLimit(vehiclesLeft);

        vehiclesLeft -= raceCarsNum;
        System.out.println("<< " + vehiclesLeft + " vehicles left to add! >>");

        if (vehiclesLeft > 0) {
            System.out.print("How many convertible cars? ");
            convertibleCarsNum = Utils.inputAndValidateMaxIntLimit(vehiclesLeft);
        }

        vehiclesLeft -= convertibleCarsNum;
        System.out.println("<< " + vehiclesLeft + " vehicles left to add! >>");

        if (vehiclesLeft > 0) {
            System.out.print("How many motor bikes? ");
            motorBikesNum = Utils.inputAndValidateMaxIntLimit(vehiclesLeft);;
        }

        vehiclesLeft -= motorBikesNum;
        System.out.println("<< " + vehiclesLeft + " vehicles left to add! >>");

        if (vehiclesLeft > 0) {
            System.out.print("How many airplanes? ");
            airplanesNum = Utils.inputAndValidateMaxIntLimit(vehiclesLeft);;
        }

        // Adding the info related to vehicles and adding it to an arraylist of vehicles
        for (int i = 0; i < raceCarsNum; i++) {
            System.out.println("Enter car's infomation >");
            RaceCar newCar = Utils.initiateRaceCar();
            vehiclesList.add(newCar);
        }

        for (int i = 0; i < convertibleCarsNum; i++) {
            System.out.println("Enter car's infomation >");
            ConvertibleCar newCar = Utils.initiateConvertibleCar();
            vehiclesList.add(newCar);
        }

        for (int i = 0; i < motorBikesNum; i++) {
            System.out.println("Enter Bike's infomation >");
            MotorBike newMotor = Utils.initiateMotorBike();
            vehiclesList.add(newMotor);
        }

        for (int i = 0; i < airplanesNum; i++) {
            System.out.println("Enter airplane's infomation >");
            Airplane newAirplane = Utils.initiateAirplane();
            vehiclesList.add(newAirplane);
        }

        System.out.println("\n---------------------------------\n");

        for (Vehicle v : vehiclesList) {
            v.displayVehicleInfo();
        }
    }
}