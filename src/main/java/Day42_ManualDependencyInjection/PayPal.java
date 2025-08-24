package Day42_ManualDependencyInjection;

public class PayPal implements PaymentService{
	
	@Override
	public void pay(String user, double amount) {
		System.out.println(user + " paid " + amount + " via PayPal");
	}

}
