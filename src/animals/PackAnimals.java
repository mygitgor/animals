package animals;

public class PackAnimals extends Animals {
    //Вьючные животные
    //Лошади, верблюды и ослы
    //имена, даты рождения, выполняемые команды и т.д
    private int cargoCapacity;
    private String type;

    public PackAnimals(String name, String type, String data, int cargoCapacity) {
        super(name, data);
        this.cargoCapacity = cargoCapacity;
        this.type = type;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String getType() {
        return type;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + ", cargoCapacity: " + getCargoCapacity() + ", type: " + getType();
    }


}
