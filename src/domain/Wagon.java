package domain;

public class Wagon extends Vehicle{
    public Wagon(String name,String motor, boolean hasSteeringWheel, int passengers, int doors, boolean isHeavyTransport, double carryingCapacity, int year) {
        super(name, motor, hasSteeringWheel, passengers, doors, isHeavyTransport, carryingCapacity, year);
    }
}
