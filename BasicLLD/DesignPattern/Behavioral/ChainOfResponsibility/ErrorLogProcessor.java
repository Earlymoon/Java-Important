package BasicLLD.DesignPattern.Behavioral.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==ERROR){
            System.out.println("ERROR "+message);
        }
        else{
            super.log(loglevel,message);
        }
    }
}
