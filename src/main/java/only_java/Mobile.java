package only_java;

public class Mobile {
	String color;
	Sim sim ;

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [color=" + color + ", sim=" + sim + "]";
	}
	
}
