package BasicLLD.DesignPattern.Behavioral.Mediator;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Bidder bidder,int amount);
}
