import java.sql.Date;
import java.util.ArrayList;

public class ConvertibleCar extends Car {

    int doorsNum;

    public ConvertibleCar(
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
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower, pickupTime);
        this.doorsNum = doorsNum;
    }
    
}
