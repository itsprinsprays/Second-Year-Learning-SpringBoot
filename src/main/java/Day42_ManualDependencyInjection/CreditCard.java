package Day42_ManualDependencyInjection;

public class CreditCard implements PaymentService{
	
	@Override
	public void pay(String user, double amount) {
		System.out.println(user + " paid " + amount + " via Credit Card");
	}

}
