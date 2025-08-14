package machine.coding.practice.java.OOPS.DesignPatterns.ObserverPattern.Observable;

import machine.coding.practice.java.OOPS.DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;


public interface StockObservable {

    public void addObserver(NotificationAlertObserver notificationAlertObserver);

    public void removeObserver(NotificationAlertObserver notificationAlertObserver);

    public void setStockCount(int newStock);

    public void notifySubscribers();

    public int getStockCount();

    public String getProductName();

}
