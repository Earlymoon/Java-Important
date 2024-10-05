package BasicLLD.DesignPattern.Behavioral.Mediator;

import java.util.*;

public class Auction implements AuctionMediator{

    List<Colleague>bidderList=new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidderList.add(bidder);

    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
         for(Colleague colleague:bidderList){
             if(!colleague.getName().equals(bidder.getName())){
                 colleague.receiveNotification(amount);
             }

         }
    }
}
