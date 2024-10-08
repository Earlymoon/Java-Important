package BasicLLD.DesignPattern.Structural.Decorator;

public class Pizza {
    public static void main(String[] args) {
        BasePizza pizza=new Musroomstoppings(new CheeseToppings(new CheeseToppings(new Mergerita())));
        System.out.println(pizza.getCost());
    }
}
