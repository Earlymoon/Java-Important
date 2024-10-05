package BasicLLD.DesignPattern.Behavioral.Strategy.After;

import BasicLLD.DesignPattern.Behavioral.Strategy.After.Strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportsVehicle();
        vehicle.drive();

    }
}
