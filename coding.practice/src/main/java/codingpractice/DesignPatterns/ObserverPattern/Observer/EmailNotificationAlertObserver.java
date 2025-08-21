package codingpractice.DesignPatterns.ObserverPattern.Observer;

import codingpractice.DesignPatterns.ObserverPattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{

    private StockObservable stockObservable;
    private String emailId;

    public EmailNotificationAlertObserver(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(stockObservable.getStockCount()+" "+stockObservable.getProductName()+" in stock, hurry up! ", emailId);
    }

    private void sendEmail(String msg, String email){
        System.out.println(msg+" sent to "+email);
    }
}
