package machine.coding.practice.java.OOPS.DesignPatterns.AbstractFactoryPattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
