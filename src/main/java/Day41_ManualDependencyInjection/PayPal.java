package Day41_ManualDependencyInjection;

public class PayPal implements NotificationService{
	
	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using PayPal");
	}

}
