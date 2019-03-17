package co.ekoew;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Main {

	public static void main(String[] args) {
		
		// Bean Factory
		/*Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Operator op1 = (Operator)factory.getBean("ops1");
		Operator op2 = (Operator)factory.getBean("ops2");
		Operator op3 = (Operator)factory.getBean("ops3");*/
		
		//Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Operator op1 = (Operator)context.getBean("ops1");
		Operator op2 = (Operator)context.getBean("ops2");
		Operator op3 = (Operator)context.getBean("ops3");
		
		System.out.println("Operator1 Details: "+op1);
		System.out.println("Operator2 Details: "+op2);
		System.out.println("Operator3 Details: "+op3);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}
}
