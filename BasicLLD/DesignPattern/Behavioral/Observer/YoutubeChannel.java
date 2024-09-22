package BasicLLD.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;
public class YoutubeChannel implements Subject {
    List<Observer>subscribers=new ArrayList<>();
    String title;

    @Override
    public void subscribe(Observer ob) {
        subscribers.add(ob);
    }

    @Override
    public void unsubscrive(Observer ob) {
         subscribers.remove(ob);
    }

    @Override
    public void newVideoUploaded(String title) {
      for(Observer ob:subscribers){
          ob.notified(title);
      }
    }
}
