package machine.coding.practice.java.OOPS.DesignPatterns.AbstractFactoryPattern;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}
