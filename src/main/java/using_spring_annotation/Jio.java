package using_spring_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Jio implements Sim {
	@Override
	public String toString() {
		return "Jio";
	}

}
