package BasicLLD.DesignPattern.Behavioral.Strategy.After;

import BasicLLD.DesignPattern.Behavioral.Strategy.After.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
