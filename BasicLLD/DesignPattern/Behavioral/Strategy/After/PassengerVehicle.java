package BasicLLD.DesignPattern.Behavioral.Strategy.After;

import BasicLLD.DesignPattern.Behavioral.Strategy.After.Strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle {
//    it just take the parent class drive feature

    PassengerVehicle(){
        super(new NormalStrategy());
    }
}
