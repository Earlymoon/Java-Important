package BasicLLD.DesignPattern.Behavioral.Command;

public class AirConditioner {
    //Receiver
    int temperature;
    boolean isOn;

    public void turnOnAc(){
        isOn=true;
        System.out.println("Ac is turning on...");
    }
    public void turnOffAc(){
        isOn=false;
        System.out.println("Ac is turning of...");
    }
    public void setTemperature(int temp){
        this.temperature=temp;
        System.out.println("Ac temperature is "+temp);
    }



}
