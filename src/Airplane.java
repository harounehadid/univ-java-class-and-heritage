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
        // Will change it later
        return 3.14f;
    }
}
