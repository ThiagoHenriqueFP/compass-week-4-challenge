package domain;

public class Motocicle extends Vehicle{
    private boolean hasElectricStart;
    public Motocicle(String motor, int passengers, boolean isHeavyTransport, double carryingCapacity, boolean hasElectricStart, int year) {
        super(motor, false, passengers, 1, isHeavyTransport, carryingCapacity, year);
        setHasElectricStart(hasElectricStart);
    }

    public boolean isHasElectricStart() {
        return hasElectricStart;
    }

    public void setHasElectricStart(boolean hasElectricStart) {
        this.hasElectricStart = hasElectricStart;
    }
}
