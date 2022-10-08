import java.time.LocalDate;

public class RaceCar extends Car {

    private boolean isTurbo;

    public RaceCar(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        int tiresNum, 
        int horsePower, 
        float pickupTime,
        boolean isTurbo
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower, pickupTime);
        this.isTurbo = isTurbo;
    }

    // Set getters
    public boolean getIsTurbo() {
        return this.isTurbo;
    }
}
