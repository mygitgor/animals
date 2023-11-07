package animals;

public class Animals {
    //животные
    //имена, даты рождения, выполняемые команды и т.д
    private String name;
    private String data;

    public Animals(String name, String data){
        this.data = data;
        this.name = name;
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

    @Override
    public String toString() {
        return "Animals [name=" + name + ", data=" + data + "]";
    }
}
