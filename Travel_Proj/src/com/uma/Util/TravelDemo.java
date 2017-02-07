package com.uma.Util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uma.Model.Journey;

public class TravelDemo {

	public static void main(String[] args) 
	{
		
		
		ApplicationContext factory1 = new ClassPathXmlApplicationContext("config1.xml");
		String[] config2 ={ "config2.xml"};
		ApplicationContext factory2 = new ClassPathXmlApplicationContext(config2 ,factory1);
		
		Object o=factory2.getBean("id3");
		Journey j=(Journey)o;
		j.startJourney();
	}

}
