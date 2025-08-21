package codingpractice.DesignPatterns.AbstractFactoryPattern;

public class MacCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }
}
