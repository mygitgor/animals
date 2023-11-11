
import animals.HumanFriends;
import animals.Service;


public class Main {
    public static void main(String[] args) throws Exception {
    
        HumanFriends humanFriends = new HumanFriends();
        Service service = new Service();
        
        // humanFriends.createHomePets("Whiskers", "2019-05-15", "Sit, Pounce");
        // humanFriends.createHomePets("Fido", "2020-01-01", "Sit, Stay, Fetch");
        // humanFriends.createHomePets("Hammy", "2021-03-10", "Roll, Hide");
        // humanFriends.createPackAnimals("Sandy", "2016-11-03", 120);
        // humanFriends.createPackAnimals("Eeyore", "2017-09-18", 152);
        // humanFriends.createPackAnimals("Storm", "2014-05-05", 170);
        // service.save(humanFriends);
        
        humanFriends = (HumanFriends)service.readFile();
        System.out.println(humanFriends.getInfo());

        
        
        
       
        
    }
}
