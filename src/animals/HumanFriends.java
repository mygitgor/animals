package animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HumanFriends implements Serializable {
   
    private List<Animals> humanFriendsList;

    public HumanFriends() {
        this(new ArrayList<>());
    }

    public void createHomePets( String name, String type, String data, String comand) {
        humanFriendsList.add(new Pets( name, type, data, comand));
    }

    public void createPackAnimals(String name, String type, String data, int cargoCapacity) {
        humanFriendsList.add(new PackAnimals(name, type, data, cargoCapacity));
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
