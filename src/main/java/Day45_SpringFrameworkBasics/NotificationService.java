package Day45_SpringFrameworkBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	private Notifier notifier;
	private Notifier smsNotifier;
	@Autowired
	public NotificationService(Notifier notifier, @Qualifier("smsNotifier") Notifier smsNotifier) {
		this.notifier = notifier;
		this.smsNotifier = smsNotifier;	
	}
	
	
//	@Autowired
//	public NotificationService(Notifier notifier) {
//		this.notifier = notifier;
//	}
	
	public void notificationProcess(String recipient, String name, String number) {
		smsNotifier.send("Hello " + name + "! Your appointment is confirmed. ",name,number );
		notifier.send("Hello " + name + "! Your appointment is confirmed. ",recipient,null);
	}
	
	

}
