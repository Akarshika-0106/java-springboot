package codingpractice.DesignPatterns.AbstractFactoryPattern;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}
