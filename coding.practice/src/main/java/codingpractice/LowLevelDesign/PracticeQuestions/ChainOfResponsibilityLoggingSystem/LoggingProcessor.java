package codingpractice.LowLevelDesign.PracticeQuestions.ChainOfResponsibilityLoggingSystem;

public abstract class LoggingProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggingProcessor nextLoggingProcessor;

    public LoggingProcessor(LoggingProcessor loggingProcessor){
        this.nextLoggingProcessor = loggingProcessor;
    }

    public void log(int level, String message){
        if(nextLoggingProcessor != null){
            nextLoggingProcessor.log(level, message);
        }
    }
}
