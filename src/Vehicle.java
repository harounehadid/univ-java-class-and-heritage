import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vehicle {
    
    private String brand;
    private String factory;
    private String color;
    private int passengersNum;
    private Date buyingDate;
    private int idPlate;
    private ArrayList tiresNum;
    private int horsePower;

    public Vehicle(
        String brand,
        String factory,
        String color,
        int passengersNum,
        Date buyingDate,
        int idPlate,
        ArrayList tiresNum,
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
    public LocalDateTime calculatePeriod(Date buyingDate) {
        return LocalDateTime.now();
    }
}
