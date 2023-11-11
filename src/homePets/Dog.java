package homePets;

import animals.Pets;

public class Dog extends Pets{

    public Dog(String name, String type, String data, String comand) {
        super(name, type, data, comand);
    }

    @Override
    public String getComand() {
        return super.getComand();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getData() {
        return super.getData();
    }
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    @Override
    public String toString() {
        return super.toString()+ " comand: " + getComand() + ", type: " + getType();
    }
}
