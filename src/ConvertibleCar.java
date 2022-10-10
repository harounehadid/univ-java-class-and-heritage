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
        ArrayList tiresSerialNum, 
        int horsePower, 
        float pickupTime,
        int doorsNum
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresSerialNum, horsePower, pickupTime);
        this.doorsNum = doorsNum;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        System.out.println("The number of doors: " + this.doorsNum);
    }

    // Getters
    public int getDoorsNumber() {
        return this.doorsNum;
    }
}
