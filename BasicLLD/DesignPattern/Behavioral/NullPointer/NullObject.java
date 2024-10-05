package BasicLLD.DesignPattern.Behavioral.NullPointer;

public class NullObject implements Vehicle{

//default behaviour
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
