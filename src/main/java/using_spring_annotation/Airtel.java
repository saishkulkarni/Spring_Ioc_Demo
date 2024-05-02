package using_spring_annotation;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public String toString() {
		return "Airtel";
	}

}
