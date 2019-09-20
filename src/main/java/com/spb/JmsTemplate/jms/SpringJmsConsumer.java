package com.spb.JmsTemplate.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

public class SpringJmsConsumer {
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
	public String receiveMessage () throws JMSException {
		TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
		return textMessage.getText();
	}

}
