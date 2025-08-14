package machine.coding.practice.LLD.Practice.ChainOfResponsibilityLoggingSystem;

public class DebugLoggingProcessor extends LoggingProcessor{

    public DebugLoggingProcessor(LoggingProcessor nextLoggingProcessor){
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == DEBUG){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
