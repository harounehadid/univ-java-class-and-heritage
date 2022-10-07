import java.sql.Date;
import java.util.ArrayList;

public class Airplane extends Vehicle {

    int enginesNum;
    float maxAltitude;

    public Airplane(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        Date buyingDate, 
        int idPlate,
        ArrayList tiresNum, 
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
