
import animals.HumanFriends;


public class Main {
    public static void main(String[] args) throws Exception {
    //    HumanFriends humanFriends = new HumanFriends();
    //     Pets pet1 = new Cat("cat", "11.11.1111", "speak");
    //     Pets pet2 = new Dog("dog", "11.11.1111", "speak");
    //     Pets pet3 = new Hamster("hamster", "11.11.1111", "speak");

    //     PackAnimals pack1 = new Camel("camel", "22.22.2222", 120);
    //     PackAnimals pack2 = new Donkey("donkey", "22.22.2222", 152);
    //     PackAnimals pack3 = new Horse("horse", "22.22.2222", 170);
        
    //    humanFriends.addAnimal(pet3);
    //    humanFriends.addAnimal(pet2);
    //    humanFriends.addAnimal(pet1);
    //    humanFriends.addAnimal(pack1);
    //    humanFriends.addAnimal(pack2);
    //    humanFriends.addAnimal(pack3);
    //    System.out.println(humanFriends.getInfo());

        HumanFriends humanFriends = new HumanFriends();
        humanFriends.createHomePets("cat", "11.11.1111", "speak");
        humanFriends.createHomePets("dog", "11.11.1111", "speak");
        humanFriends.createHomePets("hamster", "11.11.1111", "speak");
        humanFriends.createPackAnimals("camel", "22.22.2222", 120);
        humanFriends.createPackAnimals("donkey", "22.22.2222", 152);
        humanFriends.createPackAnimals("horse", "22.22.2222", 170);
        System.out.println(humanFriends.getInfo());

        
        
        
       
        
    }
}
