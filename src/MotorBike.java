import java.sql.Date;
import java.util.ArrayList;

public class MotorBike extends Vehicle {

    public MotorBike(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        Date buyingDate, 
        int idPlate,
        ArrayList tiresNum, 
        int horsePower
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower);
    }
}
