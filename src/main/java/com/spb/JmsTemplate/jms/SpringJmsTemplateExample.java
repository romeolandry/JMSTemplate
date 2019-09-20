package com.spb.JmsTemplate.jms;

import javax.jms.JMSException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJmsTemplateExample {
	public static void main (String[] args) throws JMSException {
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			SpringJmsProducer springJmsProducer = (SpringJmsProducer) context.getBean("springJmsProducer");
			springJmsProducer.sendMessage("my message with Spring jms");
			
			SpringJmsConsumer springJmsConsomer = (SpringJmsConsumer) context.getBean("springJmsConsumer");
			System.out.println("Consomer receive this message from producer: "+ springJmsConsomer.receiveMessage() );
		} finally {
			// TODO: handle finally clause
			context.close();
		}
	}

}
