package BasicLLD.DesignPattern.Behavioral.State.VendingStates.Impl;

import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Coin;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Item;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.State;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.VendingMachine;

import java.util.HashMap;
import java.util.List;

public class HashMoneyState implements State {

    public HashMoneyState(){
        System.out.println("Currently machine is in HasMoney State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
         return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Coins accpted");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
         vendingMachine.setStates(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int code) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
