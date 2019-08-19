package com.design.patterns.behavioral.mediator;

import com.design.patterns.behavioral.templatemethod.TemplatePattern;
import org.apache.log4j.Logger;

public class UserImpl extends User {

	final static Logger log = Logger.getLogger(TemplatePattern.class);

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
