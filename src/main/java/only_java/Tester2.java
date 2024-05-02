package only_java;

public class Tester2 {
	public static void main(String[] args) {

		String color = "White";
		Sim sim = new Airtel();

		Mobile mobile4 = new Mobile();
		mobile4.setColor(color);
		mobile4.setSim(sim);
		System.out.println(mobile4);

		Mobile mobile5 = new Mobile();
		mobile5.setColor(color);
		mobile5.setSim(sim);
		System.out.println(mobile5);

		Mobile mobile6 = new Mobile();
		mobile6.setColor(color);
		mobile6.setSim(sim);
		System.out.println(mobile6);

	}
}
