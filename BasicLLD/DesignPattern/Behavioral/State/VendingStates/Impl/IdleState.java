package BasicLLD.DesignPattern.Behavioral.State.VendingStates.Impl;

import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Coin;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Item;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.State;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("Currently machine is in Idle state");

    }
    public IdleState(VendingMachine vendingMachine){
        System.out.println("Machine is currently in Idle state");
        vendingMachine.setCoinList(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
          vendingMachine.setStates(new HashMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
       throw new Exception("You cannot add coin here in Idle state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseItem(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("proeduct can not be dispensed idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }
}
