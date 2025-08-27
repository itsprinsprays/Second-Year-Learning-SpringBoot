package Day45_SpringFrameworkBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	private Notifier notifier;
	
	@Autowired
	public NotificationService(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void notificationProcess(String recipient, String name) {
		notifier.send("Hello " + name + "! Your appointment is confirmed. ",recipient );
	}
	
	

}
