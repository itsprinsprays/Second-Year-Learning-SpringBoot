package Day41_ManualDependecyInjection;

public class gCash implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using Gcash");
	}
}
