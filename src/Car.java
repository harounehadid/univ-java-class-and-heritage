import java.sql.Date;
import java.util.ArrayList;

public class Car extends Vehicle {

    float pickupTime;

    public Car(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        Date buyingDate, 
        int idPlate,
        ArrayList tiresNum, 
        int horsePower,
        float pickupTime
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower);
        this.pickupTime = pickupTime;
    }
    
}
