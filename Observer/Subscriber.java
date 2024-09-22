package Observer;

public class Subscriber implements Observer {
    String name;
    Subscriber(String name){
        this.name=name;
    }
    public String notified(String title){
//        System.out.println("hello "+name+" new video"+title+" course uploaded!!!");
        return "hello "+name+" new video"+title+" course uploaded!!!";
    }

}
