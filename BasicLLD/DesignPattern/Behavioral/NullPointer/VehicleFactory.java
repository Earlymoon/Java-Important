package BasicLLD.DesignPattern.Behavioral.NullPointer;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if("Car".equals(type)){
            return new Car();
        }
        return new NullObject();
    }
}
