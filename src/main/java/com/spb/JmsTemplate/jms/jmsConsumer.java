package com.spb.JmsTemplate.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class jmsConsumer {

	public static void main(String[] args) throws JMSException {
		// TODO Auto-generated method stub
		Connection connection = null;
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://localhost:61616");
		connection = connectionFactory.createConnection();
		connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		try {
			Queue queue = session.createQueue("CustomerQueue");
			// Consumer
			MessageConsumer consumer = session.createConsumer(queue);
			TextMessage textMsg = (TextMessage) consumer.receive();
			
			System.out.println(textMsg);
			
			System.out.println("Received: '" + textMsg.getText());
			
		} finally {
			if (session != null) {
				//session.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		

	}

}
