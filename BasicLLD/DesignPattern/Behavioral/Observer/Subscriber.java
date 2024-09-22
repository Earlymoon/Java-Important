package BasicLLD.DesignPattern.Behavioral.Observer;

public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name=name;
    }
    public void notified(String title){
        System.out.println("hello "+this.name+" new video uploaded :"+title);
    }
}
