package com.spb.JmsTemplate.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SpringJmsProducer {
	private JmsTemplate jmsTemplate;
	private Destination destination;
	
	public JmsTemplate getJmsTemplate () {
		return jmsTemplate;
	}
	
	public void setJmsTemplate(JmsTemplate jsmTemplate) {
		this.jmsTemplate = jsmTemplate;
	}

	public Destination getDestinqtion () {
		return destination;
	}
	public void setDestination (Destination destination) {
		this.destination = destination;
	}
	public void sendMessage(final String msg) {
		System.out.println("Producer sends " + msg);
		jmsTemplate.send(destination, new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createTextMessage()msg;
			}
		});
	}
}
