package BasicLLD.DesignPattern.Behavioral.Strategy.After;

import BasicLLD.DesignPattern.Behavioral.Strategy.After.Strategy.OffRoadStrategy;

public class OffRoadVehicle extends Vehicle {
      OffRoadVehicle(){
          super(new OffRoadStrategy());
      }
}
