package SOLID.Liskov;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle>li=new ArrayList<>();
        li.add(new Bike());
        li.add(new Car());

        for(Vehicle vehicle:li){
            System.out.println(vehicle.getWheel());
        }
    }
}
