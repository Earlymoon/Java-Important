package BasicLLD.DesignPattern.Behavioral.NullPointer;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
