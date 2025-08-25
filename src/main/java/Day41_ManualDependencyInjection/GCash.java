package Day41_ManualDependencyInjection;

public class GCash implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using Gcash");
	}
}
