import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehicle {
    
    private String brand;
    private String factory;
    private String color;
    private int passengersNum;
    private LocalDate buyingDate;
    private int idPlate;
    private int tiresNum;
    private int horsePower;

    public Vehicle(
        String brand,
        String factory,
        String color,
        int passengersNum,
        LocalDate buyingDate,
        int idPlate,
        int tiresNum,
        int horsePower
    ) {

        this.brand = brand;
        this.factory = factory;
        this.color = color;
        this.passengersNum = passengersNum;
        this.buyingDate = buyingDate;
        this.idPlate = idPlate;
        this.tiresNum = tiresNum;
        this.horsePower = horsePower;
    }

    // This is just a random function
    public int calculateHorsePower(float x) {
        return (int)((x * Math.pow(10, 3) * 1.43f));
    }

    // I'll change it later
    public String calculatePeriod() {
        LocalDate curDate = LocalDate.now();
        
        long daysBetween = ChronoUnit.DAYS.between(this.buyingDate, curDate);
        long daysLeft = daysBetween;

        // Get the different between two dates
        int years = (int)(daysBetween / 365);
        daysLeft = daysLeft - (years * 365);
        int months = (int)(daysLeft / 30);
        daysLeft = daysLeft - (months * 30);
        int days = (int)(daysLeft);
        
        String diffDate = Integer.toString(years) + " Years - " + Integer.toString(months) + " Months - " + Integer.toString(days) + " Days";

        return diffDate;
    }

    public void displayVehicleInfo() {
        System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>> vehicle info >>>");
        System.out.println("Vehicle's brand: " + this.brand + " Made by: " + this.factory);
        System.out.println("Color: " + this.color + " Passengers number: " + this.passengersNum);
        System.out.println("Tires number: " + this.tiresNum + " Horsepower: " + this.horsePower);
        System.out.println("Buying date: " + this.buyingDate + " ID plate: " + this.idPlate);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    // Setting the getters
    public String getBrand() {
        return this.brand;
    }
    public String getFactory() {
        return this.factory;
    }
    public String getColor() {
        return this.color;
    }
    public int getPassengersNumber() {
        return this.passengersNum;
    }
    public LocalDate getBuyingDate() {
        return this.buyingDate;
    }
    public int getIdPlate() {
        return this.idPlate;
    }
    public int getTiresNumber() {
        return this.tiresNum;
    }
    public int getHorsePower() {
        return this.horsePower;
    }
}
