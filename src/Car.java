import java.time.LocalDate;

public class Car extends Vehicle {

    private float pickupTime;

    public Car(
        String brand, 
        String factory, 
        String color, 
        int passengersNum, 
        LocalDate buyingDate, 
        int idPlate,
        int tiresNum, 
        int horsePower,
        float pickupTime
    ) {
        super(brand, factory, color, passengersNum, buyingDate, idPlate, tiresNum, horsePower);
        this.pickupTime = pickupTime;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();

        System.out.println("Pickup time: " + this.pickupTime);
    }
}
