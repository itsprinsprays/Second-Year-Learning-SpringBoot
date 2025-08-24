package Day42_ManualDependencyInjection;

public class MainClass {

	public static void main(String[] args) {
		
		BookingService service = new BookingService(new Discount(),new CreditCard(), new Email(), new Console());
		service.processBook("Prince", 500, "Avengers");
		
		BookingService service1 = new BookingService(new Discount(),new PayPal(), new SMS(), new File());
		service1.processBook("Jediel", 1200, "Spider-man");
	}
}
