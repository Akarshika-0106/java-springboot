package machine.coding.practice.LLD.Practice.ChainOfResponsibilityLoggingSystem;

public class Main {

    public static void main(String[] args){
        LoggingProcessor loggingProcessor =
                new InfoLoggingProcessor(new DebugLoggingProcessor(new ErrorLoggingProcessor(null)));
        loggingProcessor.log(LoggingProcessor.ERROR, "Error has occurred");
        loggingProcessor.log(LoggingProcessor.INFO, "Process is success");
        loggingProcessor.log(LoggingProcessor.DEBUG, "In debug mode");
    }
}
