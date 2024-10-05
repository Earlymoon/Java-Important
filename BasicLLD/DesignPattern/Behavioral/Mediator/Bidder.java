package BasicLLD.DesignPattern.Behavioral.Mediator;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name,AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);

    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println("Bidder :"+ this.name+" got the notification that someone has bid the amount of "+bidAmount

            );
    }
}
