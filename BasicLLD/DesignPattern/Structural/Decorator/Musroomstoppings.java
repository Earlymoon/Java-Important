package BasicLLD.DesignPattern.Structural.Decorator;

import java.beans.beancontext.BeanContextServicesSupport;

public class Musroomstoppings extends ToppingsDecorator{
    BasePizza basePizza;
    Musroomstoppings(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int getCost(){
        return this.basePizza.getCost()+80;
    }
}
