package Day42_ManualDependencyInjection;

public class SMS implements Notifier{
	
	@Override
	public void send(String message) {
		System.out.println("SMS sent : " + message);
	}

}
