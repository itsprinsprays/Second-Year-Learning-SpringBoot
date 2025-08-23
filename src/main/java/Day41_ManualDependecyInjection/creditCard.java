package Day41_ManualDependecyInjection;

public class creditCard implements NotificationService{

	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using Credit Card");
	}
}
