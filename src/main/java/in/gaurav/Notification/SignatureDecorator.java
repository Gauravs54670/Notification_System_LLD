package in.gaurav.Notification;

public class SignatureDecorator extends NotificationDecorator {
    public SignatureDecorator(Notification notification) {

        super(notification);

    }


    @Override
    public String getContent() {

        String message = notification.getContent();
        return message + " regard Gaurav Soni";

    }
}
