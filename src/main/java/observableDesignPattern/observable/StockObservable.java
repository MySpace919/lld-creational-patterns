package observableDesignPattern.observable;

import observableDesignPattern.observer.NotificationObserver;

public interface StockObservable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObserver();
    void setStock(int stock);
    int getStock();
    String getProductName();
}
