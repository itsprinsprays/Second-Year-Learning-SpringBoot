package Day45_SpringFrameworkBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		NotificationService notificationService = context.getBean(NotificationService.class);
		
		String start = context.getBean("context", String.class);
		
		System.out.println(start);
		
		notificationService.notificationProcess("@prncbntz@gmail.com", "Prince", "09976050416");
		
	}

}
