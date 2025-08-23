package Day41_ManualDependecyInjection;

public class OrderProcess {
	
	private Notifier notifier;
	
	public OrderProcess(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void process(String name, int number) {
		System.out.println("Processing Order #" + number + " for " + name);
		notifier.sendNotification("#" + number + " has been processed");
	}

}
