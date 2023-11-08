import animals.Animals;
import homePets.Cat;
import homePets.Dog;

public class Main {
    public static void main(String[] args) throws Exception {
        Animals animals = new Animals();
        Dog dog = new Dog("Fido", "2022-01-01", "set");
        Cat cat = new Cat("Whiskers", "2019-05-15", "Pounce");
        animals.add(dog);
        animals.add(cat);
        System.out.println(animals);
    }
}
