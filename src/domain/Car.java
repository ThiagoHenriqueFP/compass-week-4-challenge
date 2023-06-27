package domain;

public class Car extends Vehicle{
    private boolean hasAirConditioner;
    private boolean hasRadio;
    public Car(String name, String motor, boolean hasSteeringWheel, int passengers, int doors, boolean isHeavyTransport, double carryingCapacity, boolean hasRadio, boolean hasAirConditioner, int year) {
        super(name, motor, hasSteeringWheel, passengers, doors, isHeavyTransport, carryingCapacity, year);
        setHasAirConditioner(hasAirConditioner);
        setHasRadio(hasRadio);
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }
}
