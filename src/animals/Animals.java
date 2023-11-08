package animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animals implements Serializable{
    //животные
    //имена, даты рождения, выполняемые команды и т.д
    private String name;
    private String data;
    private List<Animals> animaList;

    public Animals(){ this.animaList = new ArrayList<>();}

    public Animals(String name, String data){
        this.data = data;
        this.name = name;
        this.animaList = new ArrayList<>();
    }

    public List<Animals> getAnimaList() {
        return animaList;
    }

    public void add(Animals animals){
        animaList.add(animals);
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name).append("\n");
        sb.append("data: ").append(data).append("\n");
        sb.append("Animals: ").append(getAnimalsInfo()).append("\n");
        return sb.toString();
    }

    private String getAnimalsInfo(){
        String ret = "Animals:\n";
        if (animaList.size() > 0){
            for (Animals animals : animaList){
                ret+= animals.getName();    
            }
        }else{        
            ret+= "none";
        }
        return ret;
    }
}
