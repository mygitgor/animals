package animals;

import java.io.Serializable;

public class Animals implements Serializable{
    //животные
    //имена, даты рождения, выполняемые команды и т.д
    private String name;
    private String data;

    public Animals(String name, String data){
        this.name = name;
        this.data = data;
    }


    public String getName() {return name;}

    public String getData() {return data;}

    public void setName(String name) {this.name = name;}

    public void setData(String data) {this.data = data;}

    @Override
    public String toString() {
        return "name: " + name + ", data: " + data;
    }


}
