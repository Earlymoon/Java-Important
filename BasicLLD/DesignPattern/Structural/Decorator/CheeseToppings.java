package BasicLLD.DesignPattern.Structural.Decorator;

public class CheeseToppings extends ToppingsDecorator{
    BasePizza basePizza;
    CheeseToppings(BasePizza basePizza){
        this.basePizza=basePizza;

    }
    public int getCost(){
        return this.basePizza.getCost()+50;
    }
}
