package Day41_ManualDependecyInjection;

public class SMSNotifier implements Notifier{
	
	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS notification : " + message);
	}

}
