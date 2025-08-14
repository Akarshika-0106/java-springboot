package machine.coding.practice.java.OOPS.DesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = "Mac";
        if(os.equals("Mac")){
            factory = new MacFactory();
        }else{
            factory = new WindowsFactory();
        }
        Application application = new Application(factory);
        application.renderUi();

    }
}
