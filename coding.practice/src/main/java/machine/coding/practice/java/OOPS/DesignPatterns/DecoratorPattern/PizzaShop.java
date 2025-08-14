package machine.coding.practice.java.OOPS.DesignPatterns.DecoratorPattern;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new Margherita());
        System.out.println("Cost of Margherita pizza with extra cheeze: "+pizza1.cost());

        BasePizza pizza2 = new Mushroom(new Farmhouse());
        System.out.println("Cost of Farmhouse pizza with mushroom: "+pizza2.cost());

        BasePizza pizza3 = new ExtraCheese(new Jalapeno(new VegDelight()));
        System.out.println("Cost of VegDelight pizza with extra cheeze and jalapeno: "+pizza3.cost());

        BasePizza pizza4 = new ExtraCheese(new Mushroom(new Farmhouse()));
        System.out.println("Cost of Farmhouse pizza with extra cheeze and mushroom: "+pizza4.cost());
    }
}
