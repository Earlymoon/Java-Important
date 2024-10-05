package BasicLLD.DesignPattern.Behavioral.Command;

public class MyRemote {
//    invoker
    IcCommand command;
//    MyRemote(IcCommand ic){
//        this.ic=ic;
//    }
    public void setCommand(IcCommand icCommand){
        this.command=icCommand;

    }
    public void pressButton(){
        command.execute();
    }
}
