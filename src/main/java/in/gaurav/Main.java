package in.gaurav;


import in.gaurav.Manager.NotificationManager;
import in.gaurav.Notification.*;
import in.gaurav.Observer.*;
import in.gaurav.Strategy.EmailStrategy;
import in.gaurav.Strategy.SmsStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {



    Notification notification = new SimpleNotification();
    NotificationDecorator notificationDecorator =
            new SignatureDecorator(
                    new TimeStampDecorator(
                            notification
                    )
            );
        Observer observer1 = new LoggingObserver();
        Observer observer2 =
                new NotificationEngineObserver(
                        List.of(
                                new EmailStrategy(),
                                new SmsStrategy()
                        )
                );

        NotificationManager notificationManager =
                new NotificationManager(
                        notificationDecorator
                );
        ObservableSubject subject =
                new NotificationObservableSubject(notificationManager);
        subject.addObserver(observer1);

        subject.addObserver(observer2);
        subject.notifyObservers();

    }
}