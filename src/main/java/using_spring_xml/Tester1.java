package using_spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import using_spring_annotation.Mobile;

public class Tester1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("using_spring_xml/MyXml.xml");
	
		Mobile mobile1=context.getBean(Mobile.class);
		System.out.println(mobile1);
		Mobile mobile2=context.getBean(Mobile.class);
		System.out.println(mobile2);
		Mobile mobile3=context.getBean(Mobile.class);
		System.out.println(mobile3);
		
	}
}
