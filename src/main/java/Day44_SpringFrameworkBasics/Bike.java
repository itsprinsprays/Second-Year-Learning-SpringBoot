package Day44_SpringFrameworkBasics;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	@Override
	public void ride(String message) {
		System.out.println("Brand : " + message);
	}

}
