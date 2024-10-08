package BasicLLD.DesignPattern.Behavioral.State.VendingStates;
public enum Coin {
    PENNY(1),
    NICKEL(5),
    DICE(10),
    QUARTER(25);
    public int value;
    Coin(int value){
        this.value=value;
    }

}
