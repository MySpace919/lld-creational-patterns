package observableDesignPattern.observer;

import observableDesignPattern.observable.StockObservable;

public class SMSNotificationObserverImpl implements NotificationObserver {

    StockObservable stockObservable ;
    String sms;
    public SMSNotificationObserverImpl(String sms, StockObservable stockObservable){
        this.sms=sms;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {
        System.out.println("SMS Notification sent on " +sms+ " : "+ stockObservable.getProductName() +" is back in stock!");
    }
}
