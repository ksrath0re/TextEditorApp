package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAddressTest {

	public static void main(String[] args)
	{
		ApplicationContext con =  new ClassPathXmlApplicationContext("appContext.xml");
		Employee emp = (Employee)con.getBean("employee");
		emp.showAddress();

	}

}
