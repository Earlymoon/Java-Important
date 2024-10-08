package BasicLLD.DesignPattern.Behavioral.State.VendingStates;

import java.util.List;

public interface State{

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine,Coin coin )throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine)throws Exception;

    public void chooseProduct(VendingMachine vendingMachine,int code) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseItem(VendingMachine vendingMachine,int code)throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine)throws Exception;


}
