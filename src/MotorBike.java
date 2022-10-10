import java.time.LocalDate;
import java.util.ArrayList;

public class MotorBike extends Vehicle {

    public MotorBike(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        ArrayList tiresSerialNum, 
        int horsePower
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresSerialNum, horsePower);
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();
    }
}
