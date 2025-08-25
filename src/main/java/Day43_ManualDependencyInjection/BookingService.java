package Day43_ManualDependencyInjection;

public class BookingService {
	private DiscountService discountService;
	private PaymentService paymentService;
	private Notifier notifier;
	private Logger logger;
	
	public BookingService() {
		
	}
	
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	public void bookTicket(String name, double amount, String movie) {
		if(discountService != null) {
			discountService.applyDiscount(name, amount);
			double netpay = amount - (amount * 0.1);
			paymentService.pay(name, netpay);
		}else paymentService.pay(name, amount);
			
		notifier.notify("Ticket booked for " + movie + " by " + name);
			
		if(logger != null)logger.log("Booking recorded for " + name);
		
	}
}
