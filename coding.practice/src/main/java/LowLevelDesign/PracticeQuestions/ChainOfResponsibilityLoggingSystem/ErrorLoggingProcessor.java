package LowLevelDesign.PracticeQuestions.ChainOfResponsibilityLoggingSystem;

public class ErrorLoggingProcessor extends LoggingProcessor{

    public ErrorLoggingProcessor(LoggingProcessor nextLoggingProcessor){
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == ERROR){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
