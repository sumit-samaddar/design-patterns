/**
 * @author sumit
 */

package com.design.patterns.behavioral.mediator;

import com.design.patterns.behavioral.templatemethod.TemplateDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserImpl extends User {

	final static Logger log = LoggerFactory.getLogger(UserImpl.class);

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
        log.info("{}: Sending Message={}", this.name, msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		log.info("{}: Received Message={}", this.name, msg);
	}

}
