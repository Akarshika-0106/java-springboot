package machine.coding.practice.java.OOPS.DesignPatterns.ObserverPattern.Observer;

import machine.coding.practice.java.OOPS.DesignPatterns.ObserverPattern.Observable.StockObservable;

public class TextMessageNotificationAlertObserver implements NotificationAlertObserver{

    private StockObservable stockObservable;
    private String number;

    public TextMessageNotificationAlertObserver(StockObservable stockObservable, String number) {
        this.stockObservable = stockObservable;
        this.number = number;
    }

    @Override
    public void update() {
        sendEmail(stockObservable.getStockCount()+" "+stockObservable.getProductName()+" in stock, hurry up!", number);
    }

    private void sendEmail(String msg, String number){
        System.out.println(msg+ " sent to "+number);
    }
}
