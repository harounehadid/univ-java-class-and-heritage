import java.time.LocalDate;
import java.util.ArrayList;

public class Airplane extends Vehicle {

    private int enginesNum;
    private float maxAltitude;

    public Airplane(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        ArrayList tiresSerialNum, 
        int horsePower,
        int enginesNum,
        float maxAltitude
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresSerialNum, horsePower);
        this.enginesNum = enginesNum;
        this.maxAltitude = maxAltitude;
    }
    
    public float calculateCurrentAltitude(float mettersAboveGround) {
        return mettersAboveGround * 3.28084f;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        System.out.println("The number of Engines: " + this.enginesNum);
        System.out.println(" Max altitude (feet): " + this.maxAltitude);
    }

    // Getters
    public int getEnginesNumber() {
        return this.enginesNum;
    }
    public float getMaxAltitude() {
        return maxAltitude;
    }
}
