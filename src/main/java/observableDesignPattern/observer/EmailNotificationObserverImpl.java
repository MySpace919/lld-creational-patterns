package observableDesignPattern.observer;

import observableDesignPattern.observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver {
    StockObservable stockObservable ;
    String email;
    public EmailNotificationObserverImpl(String email, StockObservable stockObservable){
        this.email=email;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email Notification sent on "+email+ " : "+ stockObservable.getProductName() +" is back in stock!");
    }
}
