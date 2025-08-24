package Day42_ManualDependencyInjection;

public class Discount implements DiscountService{
	
	public void discounts(String name, double amount) {
		String tweaks = (amount >= 600) ? name + " has discount of " +(amount * 0.10) : name + " has no discount";
		System.out.println(tweaks);
	}

}
