package BasicLLD.DesignPattern.Behavioral.State.VendingStates.Impl;

import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Coin;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Item;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.State;
import BasicLLD.DesignPattern.Behavioral.State.VendingStates.VendingMachine;

import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine vendingMachine,int code) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseItem(vendingMachine, code);

    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {

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
        System.out.println("Item has been dispensed");
        Item item=vendingMachine.getInventory().getItem(code);
        vendingMachine.getInventory().updateSoldOutItem(code);
        vendingMachine.setStates(new IdleState());
        return item;


    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
