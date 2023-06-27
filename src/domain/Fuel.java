package domain;

enum FuelType {
    GASOLINE, ETHANOL, DIESEL, ELECTRICITY, HUMAN, ANIMAL
}
public class Fuel {
    private FuelType type;

    public FuelType getType() {
        return type;
    }

    public void setIsGasoline(){
        this.type = FuelType.GASOLINE;
    }
    public void setIsEthanol(){
        this.type = FuelType.ETHANOL;
    }
    public void setIsEletricity(){
        this.type = FuelType.ELECTRICITY;
    }
    public void setIsDiesel(){
        this.type = FuelType.DIESEL;
    }
    public void setIsHuman(){
        this.type = FuelType.HUMAN;
    }
    public void setIsAminal(){
        this.type = FuelType.ANIMAL;
    }

}
