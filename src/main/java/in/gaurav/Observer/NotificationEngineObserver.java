package in.gaurav.Observer;

import in.gaurav.Strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngineObserver implements Observer {

    private final List<Strategy> strategies =  new ArrayList<>();
    public NotificationEngineObserver(List<Strategy> strategies) {
        this.strategies.addAll(strategies);
    }
    @Override
    public void update(String notification) {

        for (Strategy s : strategies) {
            s.sendNotification(notification);
        }

    }
}
