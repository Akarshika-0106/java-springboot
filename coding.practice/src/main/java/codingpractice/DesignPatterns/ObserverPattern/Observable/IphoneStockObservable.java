package codingpractice.DesignPatterns.ObserverPattern.Observable;

import codingpractice.DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;
    private String productName;

    public IphoneStockObservable(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);

    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);

    }

    @Override
    public void setStockCount(int newStock) {
        stockCount = stockCount + newStock;
        if(stockCount > 0){
            notifySubscribers();
        }
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public String getProductName() {
        return productName;
    }
}
