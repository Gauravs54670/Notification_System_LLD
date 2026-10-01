package in.gaurav.Strategy;

public class SmsStrategy implements Strategy{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms " + message);
    }
}
