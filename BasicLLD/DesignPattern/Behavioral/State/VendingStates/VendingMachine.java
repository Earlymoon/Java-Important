package BasicLLD.DesignPattern.Behavioral.State.VendingStates;

import BasicLLD.DesignPattern.Behavioral.State.VendingStates.Impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Inventory inventory;
    private State vendingMachineState;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState=new IdleState();
        inventory=new Inventory(10);
        coinList=new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getStates() {
        return vendingMachineState;
    }

    public void setStates(State state) {
        this.vendingMachineState = state;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
