
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.rupj.diablo3.Diablo3Runner;

public class Diablo3Info {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("net/rupj/diablo3/xml/spring-configuration.xml");

		Diablo3Runner d3info = (Diablo3Runner) applicationContext.getBean("diablo3Runner");
		d3info.run2();
	}
}
