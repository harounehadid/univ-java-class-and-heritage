import java.time.LocalDate;
import java.util.ArrayList;

public class Car extends Vehicle {

    private float pickupTime;

    public Car(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        ArrayList tiresSerialNum, 
        int horsePower,
        float pickupTime
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresSerialNum, horsePower);
        this.pickupTime = pickupTime;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        System.out.println("Pickup time: " + this.pickupTime);
    }
}
