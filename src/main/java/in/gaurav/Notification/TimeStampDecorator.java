package in.gaurav.Notification;

import java.time.LocalDateTime;

public class TimeStampDecorator extends NotificationDecorator {
    public TimeStampDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        String message = notification.getContent();

        return message + LocalDateTime.now();

    }
}
