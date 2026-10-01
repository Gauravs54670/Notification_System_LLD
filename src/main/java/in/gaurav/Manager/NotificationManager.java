package in.gaurav.Manager;

import in.gaurav.Notification.Notification;

public class NotificationManager {

    private final Notification notification;

    public NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public String sendNotification() {
        return notification.getContent();
    }
}
