package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookStockObservable implements StockObservable{
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount;
    String productName;

    public MacBookStockObservable(String productName) {
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
    public void setStockCount(int newStockCount) {
        stockCount = stockCount + newStockCount;
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
