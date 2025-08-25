package Day43_ManualDependencyInjection;

public class MainClass {

	public static void main(String[] args) {
		
		BookingService bookingService = new BookingService();
		
		bookingService.setDiscountService((name,amount) -> System.out.println(name + " gets a discount of " + amount * .10));
		bookingService.setPaymentService((name, amount) -> System.out.println(name + " paid " + amount));
		bookingService.setNotifier(message -> System.out.println("Notification : " + message));
		bookingService.setLogger(message -> System.out.println("Log : " + message));
		
		bookingService.bookTicket("Prince", 500, "Avengers");
		System.out.println();
		
		
		bookingService.setDiscountService(null);
		bookingService.setLogger(null);
		
		bookingService.bookTicket("Anna", 800, "Spiderman");

	}
}
