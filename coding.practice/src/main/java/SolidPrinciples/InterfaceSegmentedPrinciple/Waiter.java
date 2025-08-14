package SolidPrinciples.InterfaceSegmentedPrinciple;

public class Waiter implements RestaurantEmployeeWaiter {
    @Override
    public void takeOrder() {
        System.out.println("Taking orders");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving the customers");
    }
}
