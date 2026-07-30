package com.design.patterns.behavioral.mediator;

import com.design.patterns.behavioral.templatemethod.TemplatePattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserImpl extends User {

	final static Logger log = LoggerFactory.getLogger(TemplatePattern.class);

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
		log.info(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		log.info(this.name+": Received Message:"+msg);
	}

}
