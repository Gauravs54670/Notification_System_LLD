package in.gaurav.Observer;

import in.gaurav.Manager.NotificationManager;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservableSubject implements ObservableSubject{

    List<Observer> observers = new ArrayList<>();
    NotificationManager  notificationManager;
    public NotificationObservableSubject(NotificationManager notificationManager){
        this.notificationManager = notificationManager;
    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        sendNotification();
    }
    private void sendNotification() {
        for (Observer o : observers) {
            o.update(
                    notificationManager.sendNotification()
            );
        }
    }

}
