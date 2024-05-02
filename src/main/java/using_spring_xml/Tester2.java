package using_spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import using_spring_annotation.Mobile;

public class Tester2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("using_spring_xml/MyXml.xml");

		Mobile mobile4 = context.getBean(Mobile.class);
		System.out.println(mobile4);
		Mobile mobile5 = context.getBean(Mobile.class);
		System.out.println(mobile5);
		Mobile mobile6 = context.getBean(Mobile.class);
		System.out.println(mobile6);
	}
}
