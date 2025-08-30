package Day47_SpringbootBasics.notifier;

import org.springframework.stereotype.Component;

@Component
public class EmailNotifier implements Notifier{
	@Override
	public void notify(String message) {
		System.out.print("Sending jav " + message);
	}

}
