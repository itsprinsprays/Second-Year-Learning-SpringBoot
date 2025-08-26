package Day44_SpringFrameworkBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Mainclass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProcessVehicle processVehicle = context.getBean(ProcessVehicle.class);
		
		String companyName = context.getBean("companyName", String.class);
		
		System.out.println("Welcome to " + companyName);
		processVehicle.process("Bianchi");
		
		
		
	}

}
