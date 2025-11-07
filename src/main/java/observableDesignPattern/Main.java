package observableDesignPattern;

import observableDesignPattern.observable.StockObservableImpl;
import observableDesignPattern.observer.EmailNotificationObserverImpl;
import observableDesignPattern.observer.SMSNotificationObserverImpl;
import observableDesignPattern.observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        //now in this way we can add multiople products and maintain its stock

        StockObservableImpl iphoneObservable = new StockObservableImpl("Iphone");
        StockObservableImpl laptopObservable = new StockObservableImpl("Laptop");
        NotificationObserver observer1 = new EmailNotificationObserverImpl("muskanb@zeta.tech",iphoneObservable);
        NotificationObserver observer2 = new SMSNotificationObserverImpl("9956951581",iphoneObservable);
        NotificationObserver observer3 = new SMSNotificationObserverImpl("99569515181",laptopObservable);
        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        laptopObservable.addObserver(observer3);
        iphoneObservable.setStock(10);
        iphoneObservable.setStock(0);
        laptopObservable.setStock(100);
    }
}
