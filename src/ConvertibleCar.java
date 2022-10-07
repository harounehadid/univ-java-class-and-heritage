import java.time.LocalDate;
import java.util.ArrayList;

public class ConvertibleCar extends Car {

    private int doorsNum;

    public ConvertibleCar(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        ArrayList tiresNum, 
        int horsePower, 
        float pickupTime,
        int doorsNum
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower, pickupTime);
        this.doorsNum = doorsNum;
    } 
}
