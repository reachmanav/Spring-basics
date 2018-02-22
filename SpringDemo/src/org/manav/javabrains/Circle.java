package org.manav.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher publisher;
	
	private MessageSource messageSource; 

	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	
	@Resource(name="messageSource")
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		//System.out.println(this.messageSource.getMessage("greeting.message", null, "Default Greeting from Circle Class", null));
	}

	public Point getCenter() {
		return center;
	}

//	@Required
//	@Autowired
//	@Qualifier("circleCenter")
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle.message", null, "Default Circle Draw msg", null));
		System.out.println(this.messageSource.getMessage("drawing.point.message", new Object[] {center.getX(), center.getY()} , "Default Circle Draw msg", null));
		//System.out.println("PointA: "+center.getX() + "," + center.getY());
		
		
		MyApplicationEvent newEvent = new MyApplicationEvent(publisher);
		System.out.println("Publishing Event now");
		publisher.publishEvent(newEvent);
		System.out.println("Published event now.");
	} 
	
	@PostConstruct
	public void initCircle()  {
		System.out.println("initCircle() called");
	}
	
	@PreDestroy
	public void destroyCircle()  {
		System.out.println("destroyCircle() called");
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	
	
}
