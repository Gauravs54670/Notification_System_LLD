package in.gaurav.Notification;

public abstract class NotificationDecorator implements Notification {


    protected final Notification notification;
    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }


}
