package animals;
public class PackAnimals extends Animals{
    //Вьючные животные
    //Лошади, верблюды и ослы
    //имена, даты рождения, выполняемые команды и т.д

    private int cargoCapacity;

    public PackAnimals(String name, String data, int cargoCapacity) {
        super(name, data);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
