import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 6, 23);
        ArrayList arr = new ArrayList<>();
        arr.add(4);

        

        Vehicle vehicle = new Vehicle(
            "Porche", "VW", "white", 2, date, 01007, arr, 580
        );

        System.out.println(vehicle.calculatePeriod());;
        vehicle.displayVehicleInfo();
    }
}