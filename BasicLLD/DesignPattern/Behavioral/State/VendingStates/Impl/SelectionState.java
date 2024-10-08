package BasicLLD.DesignPattern.Behavioral.State.VendingStates.Impl;

import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Coin;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Item;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.State;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.VendingMachine;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Machine is in Selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
         return;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item=vendingMachine.getInventory().getItem(code);


//        total amount paid by the user
        int paidAmount=0;
        for(Coin coin:vendingMachine.getCoinList()){
            paidAmount+=coin.value;
        }

        if(paidAmount<item.getPrice()){
            System.out.println("Insufficient amount paid : selected item price is "+item.getPrice()
            +" and you paid "+paidAmount);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient amount!");
        }
        else if(paidAmount>= item.getPrice()){
            if(paidAmount>item.getPrice()){
                getChange(paidAmount-item.getPrice());
            }
            vendingMachine.setStates(new DispenseState(vendingMachine,code));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Refunded the extra money you have paid");
        return returnChangeMoney;
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int code) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunded the whole amount in coin dispense tray");
        vendingMachine.setStates(new IdleState());
        return vendingMachine.getCoinList();
    }
}
