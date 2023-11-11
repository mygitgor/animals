package animals;
import java.io.Serializable;

public class Service {
    private String filePath;
    private Writable writable;
    private HumanFriends three;
    
    public Service() {
        this.filePath = "src/animals/animals.txt";
        this.writable = new FileHandler();     
        this.three = new HumanFriends();
    }

    public void save(Serializable serializable) {
        writable.saveToFile(serializable, filePath);
    }

    public Object readFile() {
       return writable.loadFromFile(filePath);
    }

}