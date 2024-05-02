package only_java;

public class Tester1 {
	public static void main(String[] args) {
		String color = "White";
		Sim sim = new Airtel();

		Mobile mobile1 = new Mobile();
		mobile1.setColor(color);
		mobile1.setSim(sim);
		System.out.println(mobile1);

		Mobile mobile2 = new Mobile();
		mobile2.setColor(color);
		mobile2.setSim(sim);
		System.out.println(mobile2);

		Mobile mobile3 = new Mobile();
		mobile3.setColor(color);
		mobile3.setSim(sim);
		System.out.println(mobile3);

	}
}
