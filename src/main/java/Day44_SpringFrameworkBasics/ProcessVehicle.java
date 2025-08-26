package Day44_SpringFrameworkBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessVehicle {
	
	private Bike bike;
	
	@Autowired
	public ProcessVehicle(Bike bike) {
		this.bike = bike;
	}
	
	public void process(String brand) {
		bike.ride(brand);
	}

}
