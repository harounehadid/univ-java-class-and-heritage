import java.time.LocalDate;

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
        int tiresNum, 
        int horsePower,
        int enginesNum,
        float maxAltitude
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower);
        this.enginesNum = enginesNum;
        this.maxAltitude = maxAltitude;
    }
    
    public float calculateCurrentAltitude(float mettersAboveGround) {
        return mettersAboveGround * 3.28084f;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        System.out.println("The number of Engines: " + this.enginesNum + " Max altitude (feet): " + this.maxAltitude);
    }

    // Getters
    public int getEnginesNumber() {
        return this.enginesNum;
    }
    public float getMaxAltitude() {
        return maxAltitude;
    }
}
