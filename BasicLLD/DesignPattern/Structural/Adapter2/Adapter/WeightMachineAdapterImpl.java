package BasicLLD.DesignPattern.Structural.Adapter2.Adapter;

import BasicLLD.DesignPattern.Structural.Adapter2.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

//    it has weightmachine interface
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound=weightMachine.getWeightInPound();

        return weightInPound*0.45;
    }
}
