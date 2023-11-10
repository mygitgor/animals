package animals;

public class Pets extends Animals  {
    //домашние питомцы
    //собаки, кошки, хомяки, 
    //имена, даты рождения, выполняемые команды и т.д
    private String comand;

    public Pets(String name, String data, String comand) {
        super(name, data);
        this.comand = comand;
    }


    public String getComand() {
        return comand;
    }

    @Override
    public String toString(){
        return super.toString() + ", comand: " + getComand();
    }


}
