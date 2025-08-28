package Day45_SpringFrameworkBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "Day45_SpringFrameworkBasics")
public class AppConfig {
	
	@Bean
	public String context() {
		return "[INFO] Starting Spring Context....";
	}

}
