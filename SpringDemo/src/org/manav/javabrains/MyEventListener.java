package org.manav.javabrains;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {


	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("onApplicationEvent Listener has been called: " + event.toString() + ".Listner finished." );
		
	}

}
