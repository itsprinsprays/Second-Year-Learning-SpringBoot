package Day41_ManualDependencyInjection;

public class MainClass {
	
	public static void main(String[] args) {

		
		NotificationService service = new creditCard();
		PaymentManager payment1 = new PaymentManager(service);
		payment1.payment("Prince", 500);
		
		NotificationService service1 = new PayPal();
		PaymentManager payment2 = new PaymentManager(service1);
		payment2.payment("Jediel", 1200);
		
		NotificationService service2 = new GCash();
		PaymentManager payment3 = new PaymentManager(service2);
		payment3.payment("Mika", 300);
		
		System.out.println("");
		
		Notifier notifier = new EmailNotifier();
		OrderProcess process = new OrderProcess(notifier);
		process.process("Prince", 101);
		
		Notifier notifier1 = new SMSNotifier();
		OrderProcess process1 = new OrderProcess(notifier1);
		process1.process("Jediel", 202);
		
		
		
	}

}	
