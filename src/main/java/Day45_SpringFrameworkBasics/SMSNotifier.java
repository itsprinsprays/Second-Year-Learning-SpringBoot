package Day45_SpringFrameworkBasics;

import org.springframework.stereotype.Component;

@Component
public class SMSNotifier implements Notifier{
	
	@Override
	public void send(String message, String recipient) {
		System.out.println("Sending SMS to " + recipient + ": " + message);
	}
}
