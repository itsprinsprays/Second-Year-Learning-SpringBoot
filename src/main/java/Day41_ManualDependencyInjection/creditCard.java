package Day41_ManualDependencyInjection;

public class creditCard implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using Credit Card");
	}
}
