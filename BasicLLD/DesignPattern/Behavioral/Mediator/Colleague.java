package BasicLLD.DesignPattern.Behavioral.Mediator;

public interface Colleague {

//    it has three methods
    public String getName();
    public void placeBid(int amount);

    public void receiveNotification(int bidAmount);

}
