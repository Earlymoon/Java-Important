package BasicLLD.DesignPattern.Behavioral.Command;

public class AcTurnOnCommand implements IcCommand{

    AirConditioner ac;

    AcTurnOnCommand(AirConditioner airConditioner){
        this.ac=airConditioner;

    }
    public void execute(){
        ac.turnOnAc();
    }
}
