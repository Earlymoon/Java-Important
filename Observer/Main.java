package Observer;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Subject channel=new YoutubeChannel();

        Observer subscriber1=new Subscriber("abhishek");
        Observer subscriber2=new Subscriber("satyam");
        Observer subscriber3=new Subscriber("vishal");
        Observer subscriber4=new Subscriber("cp");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber4);
        List<String>messages=channel.videoUploaded("c++");
        List<String>messages1=channel.videoUploaded("java");

    }
}
