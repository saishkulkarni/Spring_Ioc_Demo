package using_spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	//@Qualifier("getSim")
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [sim=" + sim + "]";
	}

}
