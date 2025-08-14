package machine.coding.practice.java.OOPS.SOLIDPrinciples.DependencyInversionPrinciple;

public class Macbook {
    private Keyboard keyboard;
    private Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
