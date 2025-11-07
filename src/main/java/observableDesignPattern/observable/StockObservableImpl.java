package observableDesignPattern.observable;

import observableDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable {
    private int stock = 0;
    private final String productName;
    private final List<NotificationObserver> observers = new ArrayList<>();

    public StockObservableImpl(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(NotificationObserver observer) { observers.add(observer); }
    @Override
    public void removeObserver(NotificationObserver observer) { observers.remove(observer); }

    @Override
    public void notifyObserver() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stockUpdate) {
        if (this.stock == 0 && stockUpdate > 0) {
            notifyObserver();
        }
        this.stock = stockUpdate;
    }

    @Override
    public int getStock() { return stock; }

    @Override
    public String getProductName() { return productName; }
}

