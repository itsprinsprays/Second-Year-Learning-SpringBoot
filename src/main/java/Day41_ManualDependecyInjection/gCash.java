package Day41_ManualDependecyInjection;

public class GCash implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using Gcash");
	}
}
