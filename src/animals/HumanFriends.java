package animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import homePets.Cat;
import homePets.Dog;
import homePets.Hamster;
import packAnimals.Camel;
import packAnimals.Donkey;
import packAnimals.Horse;

public class HumanFriends implements Serializable {
   
    private List<Animals> humanFriendsList;

    public HumanFriends() {
        this(new ArrayList<>());
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
