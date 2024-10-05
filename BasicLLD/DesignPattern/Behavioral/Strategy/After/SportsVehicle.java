package BasicLLD.DesignPattern.Behavioral.Strategy.After;

import BasicLLD.DesignPattern.Behavioral.Strategy.After.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
//    it needs to change the parent class drive method
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
