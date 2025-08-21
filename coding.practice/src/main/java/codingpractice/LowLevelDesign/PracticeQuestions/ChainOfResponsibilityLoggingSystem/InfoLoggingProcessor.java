package codingpractice.LowLevelDesign.PracticeQuestions.ChainOfResponsibilityLoggingSystem;

public class InfoLoggingProcessor extends LoggingProcessor{

    public InfoLoggingProcessor(LoggingProcessor nextLoggingProcessor){
        super(nextLoggingProcessor);
    }

    public void log(int level, String message){
        if(level == INFO){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
