package machine.coding.practice.java.OOPS.DesignPatterns.DecoratorPattern;

public class Jalapeno extends ToppingDecorator{
    private BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+40;
    }
}
