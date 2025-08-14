package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneStockObservable;
import DesignPatterns.ObserverPattern.Observable.MacBookStockObservable;
import DesignPatterns.ObserverPattern.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Observer.EmailNotificationAlertObserver;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;
import DesignPatterns.ObserverPattern.Observer.TextMessageNotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable("Iphone");
        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver(iphoneStockObservable, "xyz@gmail.com");
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver(iphoneStockObservable, "abz@gmail.com");
        NotificationAlertObserver observer3 = new TextMessageNotificationAlertObserver(iphoneStockObservable, "7789456321");
        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setStockCount(10);
        System.out.println(iphoneStockObservable.getStockCount());
        iphoneStockObservable.setStockCount(100);
        System.out.println(iphoneStockObservable.getStockCount());

        StockObservable macbookStockObservable = new MacBookStockObservable("MacBook");
        NotificationAlertObserver observer4 = new EmailNotificationAlertObserver(macbookStockObservable, "uvw@gmail.com");
        NotificationAlertObserver observer5 = new EmailNotificationAlertObserver(macbookStockObservable, "efg@gmail.com");
        NotificationAlertObserver observer6 = new TextMessageNotificationAlertObserver(macbookStockObservable, "9989456321");
        macbookStockObservable.addObserver(observer4);
        macbookStockObservable.addObserver(observer5);
        macbookStockObservable.addObserver(observer6);

        macbookStockObservable.setStockCount(50);
        System.out.println(macbookStockObservable.getStockCount());
        macbookStockObservable.setStockCount(75);
        System.out.println(macbookStockObservable.getStockCount());

    }
}
