package Observer;

import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.*;

public class YoutubeChannel implements Subject{
    List<Observer>userList=new ArrayList<>();

    public void subscribe(Observer ob){
        userList.add(ob);
    }
    public void unsubscribe(Observer ob){
        userList.remove(ob);
    }

    @Override
    public List<String> videoUploaded(String title) {
        List<String>message=new ArrayList<>();
        for(Observer ob:userList){
            String curr=ob.notified(title);
            message.add(curr);



        }
        return  message;

    }




}
