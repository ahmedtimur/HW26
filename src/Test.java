import classes.Car;
import classes.CarDetails;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<Car, CarDetails> map = new HashMap<>();

        map.put(new Car(1, "01KG345AB"),
                new CarDetails(2011, 15000, "Black", "Mercedes"));

        map.put(new Car(2, "01KG555AH"),
                new CarDetails(2020, 20000, "Black", "Toyota"));

        map.put(new Car(3, "08KG245BB"),
                new CarDetails(2005, 5000, "Green", "Volkswagen"));

        map.put(new Car(4, "04KG700LR"),
                new CarDetails(2009, 9000, "Red", "Honda"));

        for(Map.Entry<Car, CarDetails> i: map.entrySet())
            System.out.println(i);

    }
}
