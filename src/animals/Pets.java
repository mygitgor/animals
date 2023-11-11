package animals;

public class Pets extends Animals  {
    //домашние питомцы
    //собаки, кошки, хомяки, 
    //имена, даты рождения, выполняемые команды и т.д
    private String comand;
    private String type;

    public Pets(String name, String type, String data, String comand) {
        super(name, data);
        this.comand = comand;
        this.type = type;
    }

    public String getComand() {
        return comand;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return super.toString() + ", comand: " + getComand() + ", type: " + getType();
    }


}
