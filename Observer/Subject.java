package Observer;
import java.util.*;
interface Subject {
    public void subscribe(Observer ob);

    public void unsubscribe(Observer ob);

    public List<String> videoUploaded(String tile);
}
