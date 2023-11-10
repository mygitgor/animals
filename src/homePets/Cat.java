package homePets;

import animals.Pets;

public class Cat extends Pets{

    public Cat(String name, String data, String comand) {
        super(name, data, comand);
    }

    @Override
    public String toString() {
        return super.toString()+ " comand: " + getComand();
    }

    @Override
    public String getComand() {
        return super.getComand();
    }

    @Override
    public String getData() {
        return super.getData();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
