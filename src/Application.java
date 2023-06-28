import domain.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> myVehicles = new ArrayList<>();
        try {
            Car hondaCivic = new Car(
                    "Honda Civic",
                    "V-Tech 2.2",
                    true,
                    5,
                    4,
                    false,
                    500,
                    true,
                    true,
                    2015
            );

            Car fusca = new Car(
                    "Fusca 1600",
                    "Boxer 1.6",
                    true,
                    4,
                    2,
                    false,
                    400,
                    true,
                    false,
                    1965
            );

            Motocicle yamahaFazer = new Motocicle(
                    "Fazer",
                    "yz 250cc",
                    2,
                    false,
                    200,
                    true,
                    2020
            );

            Bike bike = new Bike(
                    "Absolute nero 4",
                    2,
                    true,
                    200,
                    true,
                    true,
                    2023
            );

            Truck truck = new Truck(
                    "Astralis",
                    "Cummins 8.4",
                    true,
                    2,
                    2,
                    true,
                    10000,
                    4,
                    2001
            );


            myVehicles.add(hondaCivic);
            myVehicles.add(fusca);
            myVehicles.add(yamahaFazer);
            myVehicles.add(bike);
            myVehicles.add(truck);

            myVehicles.forEach(
                    it -> {
                        System.out.println("Vehicle " + it.getName());
                        System.out.println("Vehicle " + it.getYear());
                        System.out.println("------------------------");
                    }
            );

            myVehicles.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
