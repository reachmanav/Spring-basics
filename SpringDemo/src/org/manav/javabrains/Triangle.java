package org.manav.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context = null;
	
	
	public void myInit()  {
		System.out.println("init-method myInit called");
	}
	
	public void myDestroy()  {
		System.out.println("destroy-method myDestroy called");
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	@Override
	public void draw ()  {
		
			System.out.println("PointA: "+pointA.getX() + "," + pointA.getY());
			System.out.println("PointB: "+pointB.getX() + "," + pointB.getY());
			System.out.println("PointC: "+pointC.getX() + "," + pointC.getY());
					
	}

//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		this.context = context;
//	}
//
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("Beanname is:" +beanName);
//		
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Destroying Bean now");
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Initialized Bean now");
//		
//	}
	
}
