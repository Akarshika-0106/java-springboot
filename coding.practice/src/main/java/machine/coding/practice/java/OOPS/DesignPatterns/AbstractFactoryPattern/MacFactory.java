package machine.coding.practice.java.OOPS.DesignPatterns.AbstractFactoryPattern;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
