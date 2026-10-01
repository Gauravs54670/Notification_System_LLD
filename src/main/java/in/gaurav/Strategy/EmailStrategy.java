package in.gaurav.Strategy;

public class EmailStrategy implements Strategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email " + message);
    }
}
