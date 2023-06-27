package domain;

public class Truck extends Vehicle{
    private int AxisQuantity;
    public Truck(String motor, boolean hasSteeringWheel, int passengers, int doors, boolean isHeavyTransport, double carryingCapacity, int axisQuantity, int year) {
        super(motor, hasSteeringWheel, passengers, doors, isHeavyTransport, carryingCapacity, year);
        setAxisQuantity(axisQuantity);
    }

    public int getAxisQuantity() {
        return AxisQuantity;
    }

    public void setAxisQuantity(int axisQuantity) {
        if(axisQuantity < 0)
            throw new IllegalArgumentException();
        AxisQuantity = axisQuantity;
    }
}
