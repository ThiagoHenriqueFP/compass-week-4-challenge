import domain.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> myVehicles = new ArrayList<>();

        Vehicle hondaCivic = new Car(
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

        Vehicle fusca = new Car(
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

        Vehicle yamahaFazer = new Motocicle(
                "yz 250cc",
                2,
                false,
                200,
                true,
                2020
        );

        Vehicle bike = new Bike(
                2,
                true,
                200,
                true,
                true,
                2023
        );

        Vehicle truck = new Truck(
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


    }

}
