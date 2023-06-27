package domain;

public class Bike extends Vehicle{
    private boolean isElectric;
    private boolean hasBagager;
    public Bike(int passengers, boolean isHeavyTransport, double carryingCapacity, boolean isElectric, boolean hasBagager, int year) {
        super("none", false, passengers, 1, isHeavyTransport, carryingCapacity, year);
        setElectric(isElectric);
        setHasBagager(hasBagager);
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isHasBagager() {
        return hasBagager;
    }

    public void setHasBagager(boolean hasBagager) {
        this.hasBagager = hasBagager;
    }
}