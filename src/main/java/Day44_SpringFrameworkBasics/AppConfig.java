package Day44_SpringFrameworkBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Day44_SpringFrameworkBasics")
public class AppConfig {
	
	@Bean
	public String companyName() {
		return "Prince Brand";
	}
	

}
