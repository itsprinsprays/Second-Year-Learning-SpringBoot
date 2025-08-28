package Day45_SpringFrameworkBasics;

import org.springframework.stereotype.Component;

@Component("smsNotifier")
public class SMSNotifier implements Notifier{
	
	@Override
	public void send(String message, String recipient,String number) {
		System.out.println("Sending SMS to " + number + ": " + message);
	}
}
