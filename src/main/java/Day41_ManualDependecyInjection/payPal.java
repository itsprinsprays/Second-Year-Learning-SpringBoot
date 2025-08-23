package Day41_ManualDependecyInjection;

public class payPal implements NotificationService{
	
	@Override
	public void sendNotification(String message) {
		System.out.println(message + " using PayPal");
	}

}
