package com.uma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic
{
 public static void main(String[] args) {
	 String res = "spconfig.xml";
		ApplicationContext factory=new ClassPathXmlApplicationContext(res);
		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean)o;

		wb.show();

}
}
