package Day42_ManualDependencyInjection;

public class Email implements Notifier{
	
	@Override
	public void send(String message) {
		System.out.println("Email sent : " + message);
	}

}
