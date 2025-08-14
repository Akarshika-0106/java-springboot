package machine.coding.practice.java.OOPS.DesignPatterns.AbstractFactoryPattern;

public interface GUIFactory {
    //Here, GUIFactory is abstract factory

     Button createButton();
     Checkbox createCheckbox();

}
