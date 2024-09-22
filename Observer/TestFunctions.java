package Observer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TestFunctions {

        Subject channel=new YoutubeChannel();
    @Test
    public void Test1() {
        String u1 = "Abhishek";
        String u2 = "CP";
        Observer subscriber1=new Subscriber(u1);
        Observer subscriber2=new Subscriber(u2);
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        String s1 = "hello "+u1+" new video"+"c++"+" course uploaded!!!";
        String s2 = "hello "+u2+" new video"+"c++"+" course uploaded!!!";
        List<String>m1_exp = List.of(new String[]{s1, s2});
        List<String> m1 = channel.videoUploaded("c++");
        List<String>m2=channel.videoUploaded("java");
        assertEquals(m1, m1_exp);
    }


}
