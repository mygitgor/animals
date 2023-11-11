
import animals.HumanFriends;
import animals.Service;


public class Main {
    public static void main(String[] args) throws Exception {
    
        HumanFriends humanFriends = new HumanFriends();
        Service service = new Service();
        
        // humanFriends.createHomePets("Whiskers","Cat", "2019-05-15", "Sit, Pounce");
        // humanFriends.createHomePets("Fido", "Dog","2020-01-01", "Sit, Stay, Fetch");
        // humanFriends.createHomePets("Hammy", "Hamster","2021-03-10", "Roll, Hide");
        // humanFriends.createPackAnimals("Sandy","Camel", "2016-11-03", 120);
        // humanFriends.createPackAnimals("Eeyore", "Donky","2017-09-18", 152);
        // humanFriends.createPackAnimals("Storm", "Horse","2014-05-05", 170);
        // service.save(humanFriends);
        
        humanFriends = (HumanFriends)service.readFile();
        System.out.println(humanFriends.getInfo());

        
        
        
       
        
    }
}
