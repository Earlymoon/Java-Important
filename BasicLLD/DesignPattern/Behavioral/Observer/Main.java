package BasicLLD.DesignPattern.Behavioral.Observer;

public class Main {
    public static void main(String[] args) {

        Subject channel=new YoutubeChannel();
        Observer observer=new Subscriber("chandra");
        Observer observer1=new Subscriber("satyam");

        channel.subscribe(observer);
        channel.subscribe(observer1);

        channel.newVideoUploaded("java ");
        channel.newVideoUploaded("system design");
    }
}
