package Day45_SpringFrameworkBasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotifier implements Notifier{
	
	@Override
	public void send(String message, String recipient, String numb) {
		System.out.println("Sending Email to : " + recipient + ": " + message);
		
	}

}
