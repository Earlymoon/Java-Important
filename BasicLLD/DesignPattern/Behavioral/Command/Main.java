package BasicLLD.DesignPattern.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        MyRemote myRemote=new MyRemote();
        myRemote.setCommand(new AcTurnOnCommand(airConditioner));
        myRemote.pressButton();



    }
}
