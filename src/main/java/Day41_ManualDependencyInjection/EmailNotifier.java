package Day41_ManualDependencyInjection;

public class EmailNotifier implements Notifier{

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending email notification : " + message);
	}
}
