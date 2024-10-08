package BasicLLD.DesignPattern.Behavioral.ChainOfResponsibility;

public abstract class LogProcessor {

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor=nextLogProcessor;
    }

    public void log(int loglevel,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(loglevel,message);
        }
    }
}
