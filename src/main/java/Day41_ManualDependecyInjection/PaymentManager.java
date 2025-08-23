package Day41_ManualDependecyInjection;

public class PaymentManager {
	
	private NotificationService notifacationService;
	
	public PaymentManager(NotificationService notificationService) {
		this.notifacationService = notificationService;
	}
	
	public void payment(String name,double price) {
		notifacationService.sendNotification(name + " paid " + price);
	}

}
