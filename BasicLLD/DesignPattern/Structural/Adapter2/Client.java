package BasicLLD.DesignPattern.Structural.Adapter2;

import BasicLLD.DesignPattern.Structural.Adapter2.Adaptee.WeightMachineForBabies;
import BasicLLD.DesignPattern.Structural.Adapter2.Adapter.WeightMachineAdapter;
import BasicLLD.DesignPattern.Structural.Adapter2.Adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println("weight in kg is :"+weightMachineAdapter.getWeightInKg());

    }
}
