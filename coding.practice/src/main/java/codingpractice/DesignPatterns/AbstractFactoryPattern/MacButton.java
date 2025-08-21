package codingpractice.DesignPatterns.AbstractFactoryPattern;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }
}
