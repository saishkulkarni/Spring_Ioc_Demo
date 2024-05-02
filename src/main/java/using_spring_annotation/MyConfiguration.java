package using_spring_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class MyConfiguration {

	@Bean
	public BSNL getSim() {
		return new BSNL();
	}
}
