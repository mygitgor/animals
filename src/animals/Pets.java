package animals;
public class Pets extends Animals {
    //домашние питомцы
    //собаки, кошки, хомяки, 
    //имена, даты рождения, выполняемые команды и т.д
    private String comand;

    public Pets(String name, String data) {
        super(name, data);
        this.comand = comand;
    }

    public String getComand() {
        return comand;
    }

    public void setComand(String comand) {
        this.comand = comand;
    }


    
}
