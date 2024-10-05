package BasicLLD.DesignPattern.Behavioral.Command;

public class AcTurnOfCommand implements IcCommand{
    AirConditioner ac;
    AcTurnOfCommand(AirConditioner airConditioner){
        this.ac=airConditioner;
    }
    public void execute(){
        ac.turnOffAc();
    }
}
