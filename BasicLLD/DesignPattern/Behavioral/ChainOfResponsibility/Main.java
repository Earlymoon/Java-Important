package BasicLLD.DesignPattern.Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor=new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"error occurs");
        logProcessor.log(LogProcessor.INFO,"showing info");
        logProcessor.log(LogProcessor.DEBUG,"ready to debug");

    }
}
