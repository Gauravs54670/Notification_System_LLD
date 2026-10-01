package in.gaurav.Observer;

import in.gaurav.Notification.Notification;

public class LoggingObserver implements Observer {



    @Override
    public void update(String notification) {
        System.out.println(
                notification
        );
    }
}
