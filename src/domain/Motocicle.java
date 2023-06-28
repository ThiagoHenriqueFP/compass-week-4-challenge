package domain;

public class Motocicle extends Vehicle{
    private boolean hasElectricStart;
    public Motocicle(String name, String motor, int passengers, boolean isHeavyTransport, double carryingCapacity, boolean hasElectricStart, int year) {
        super(name, motor, false, passengers, 1, isHeavyTransport, carryingCapacity, year);
        setHasElectricStart(hasElectricStart);
    }

    public boolean isHasElectricStart() {
        return hasElectricStart;
    }

    public void setHasElectricStart(boolean hasElectricStart) {
        this.hasElectricStart = hasElectricStart;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hasElectricStart=" + hasElectricStart +
                "}";
    }
}
