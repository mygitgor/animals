package animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HumanFriends implements Serializable {
   
    private List<Animals> humanFriendsList;

    public HumanFriends() {
        this(new ArrayList<>());
    }

    public void createHomePets( String name, String data, String comand) {
        humanFriendsList.add(new Pets(name, data, comand));
    }

    public void createPackAnimals(String name, String data, int cargoCapacity) {
        humanFriendsList.add(new PackAnimals(name, data, cargoCapacity));
    }

    public HumanFriends(List<Animals> humanFriendsList) {
        this.humanFriendsList = humanFriendsList;
    }

    public void addAnimal(Animals animal) {
        humanFriendsList.add(animal);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animals:\n");
        if (humanFriendsList.size() > 0) {
            for (Animals animals : humanFriendsList) {
                sb.append(animals);
                sb.append("\n");
            }
        } else {
            sb.append("none");
        }
        return sb.toString();
    }
}
