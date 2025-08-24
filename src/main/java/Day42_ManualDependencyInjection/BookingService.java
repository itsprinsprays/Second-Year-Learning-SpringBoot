package Day42_ManualDependencyInjection;

public class BookingService {
	
	private PaymentService paymentService;
	private Notifier notifier;
	private Logger logger;
	private DiscountService discountService;
	
	public BookingService(DiscountService discountService, PaymentService paymentService, Notifier notifier, Logger logger) {
			this.discountService = discountService;
			this.paymentService = paymentService;
			this.notifier = notifier;
			this.logger = logger;
	}
	
	public void processBook(String name, double amount, String ticket) {
		discountService.discounts(name,amount);
		paymentService.pay(name, amount);
		notifier.send("Ticket booked for " + ticket + " by " + name);
		logger.log("Booking recorded for " + name);
	}

}
