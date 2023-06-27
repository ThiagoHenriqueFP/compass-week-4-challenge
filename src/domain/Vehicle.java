package domain;

public class Vehicle {
    private String motor;
    private boolean hasSteeringWheel;
    private int passengers;
    private int doors;
    private boolean isHeavyTransport;
    private double carryingCapacity;
    private int year;
    private String name;
    private final Fuel fuel;

    public Vehicle(String name,String motor, boolean hasSteeringWheel, int passengers, int doors, boolean isHeavyTransport, double carryingCapacity, int year) {
        setName(name);
        setYear(year);
        setMotor(motor);
        setDoors(doors);
        setPassengers(passengers);
        setHeavyTransport(isHeavyTransport);
        setCarryingCapacity(carryingCapacity);
        setHasSteeringWheel(hasSteeringWheel);
        this.fuel = new Fuel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException();
        this.name = name;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        if(motor.isBlank() || motor.isEmpty())
            throw new IllegalArgumentException();

        this.motor = motor;
    }

    public boolean isHasSteeringWheel() {
        return hasSteeringWheel;
    }

    public void setHasSteeringWheel(boolean hasSteeringWheel) {
        this.hasSteeringWheel = hasSteeringWheel;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if(passengers < 0)
            throw new IllegalArgumentException();
        this.passengers = passengers;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors < 1)
            throw new IllegalArgumentException();
        this.doors = doors;
    }

    public boolean isHeavyTransport() {
        return isHeavyTransport;
    }

    public void setHeavyTransport(boolean heavyTransport) {
        isHeavyTransport = heavyTransport;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        if(carryingCapacity < 0)
            throw new IllegalArgumentException();
        this.carryingCapacity = carryingCapacity;
    }

    public void setIsGasoline(){
        this.fuel.setIsGasoline();
    }
    public void setIsEthanol(){
        this.fuel.setIsEthanol();
    }
    public void setIsEletricity(){
        this.fuel.setIsEletricity();
    }
    public void setIsDiesel(){
        this.fuel.setIsDiesel();
    }
    public void setIsHuman(){
        this.fuel.setIsHuman();
    }
    public void setIsAminal(){
        this.fuel.setIsAminal();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0)
            throw new IllegalArgumentException();
        this.year = year;
    }
}
