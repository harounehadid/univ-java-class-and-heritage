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

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        if (this.isTurbo) {
            System.out.println("Turbo is available");
        }
        else {
            System.out.println("Turbo is NOT available!");
        }
    }

    // Set getters
    public boolean getIsTurbo() {
        return this.isTurbo;
    }
}
