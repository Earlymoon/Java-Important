package BasicLLD.DesignPattern.Behavioral.NullPointer;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicle("Car");
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
