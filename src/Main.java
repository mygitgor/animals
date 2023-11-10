import animals.Animals;
import animals.HumanFriends;
import animals.Pets;
import homePets.Cat;
import homePets.Dog;
import homePets.Hamster;

public class Main {
    public static void main(String[] args) throws Exception {
       HumanFriends humanFriends = new HumanFriends();
        Pets pet1 = new Cat("cat", "11.11.1111", "speak");
        Pets pet2 = new Dog("dog", "11.11.1111", "speak");
        Pets pet3 = new Hamster("hamster", "11.11.1111", "speak");
       humanFriends.addAnimal(pet3);
       humanFriends.addAnimal(pet2);
       humanFriends.addAnimal(pet1);
       System.out.println(humanFriends.getInfo());
        
        
        
       
        
    }
}
