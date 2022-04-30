package com.masai.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.Circle;
import com.masai.model.Rectangle;
import com.masai.model.Square;


public class Application {

	public static void main(String[] args) {
		
		//activate spring container
		ApplicationContext applicationContext=	new ClassPathXmlApplicationContext("applicationContext.xml");
		//Patient patientBean=applicationContext.getBean(Patient.class,"patientBean");
		//patientBean.fun();
		
		Circle circle=applicationContext.getBean(Circle.class,"circle");
		System.out.println(circle.calculateArea(20));
		
		Rectangle rectangle=applicationContext.getBean(Rectangle.class,"rectangle");
		System.out.println(rectangle.calculateArea(20,10));
		
		Square square=applicationContext.getBean(Square.class,"square");
		System.out.println(square.calculateArea(10));
		
		
		
		
		

	}

}
