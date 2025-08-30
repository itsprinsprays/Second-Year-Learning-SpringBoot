package Day47_SpringbootBasics.service;

import org.springframework.stereotype.Service;
import Day47_SpringbootBasics.notifier.Notifier;

@Service
public class NotificationService {
	
	private Notifier notifier;
	
	public NotificationService(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void send(String message) {
		notifier.notify(message);
	}

}
