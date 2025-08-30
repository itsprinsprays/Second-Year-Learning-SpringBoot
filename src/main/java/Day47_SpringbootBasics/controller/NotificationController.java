package Day47_SpringbootBasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Day47_SpringbootBasics.service.NotificationService;

@RestController
public class NotificationController {
	
	private final NotificationService notificationService;
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	@GetMapping("/notify")
	public String notifyUser() {
		notificationService.send("Hello From Springboot");
		return "Notification Sent";
	}

}
