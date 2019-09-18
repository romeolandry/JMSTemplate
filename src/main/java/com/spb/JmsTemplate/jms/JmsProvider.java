package com.spb.JmsTemplate.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsProvider {
	public static void main(String[] args) throws JMSException {
		Connection connection = null;
		try {
			// producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					"tcp://localhost:61616");
			connection = connectionFactory.createConnection();
			Session session =  connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("customerQueue");
			MessageProducer producer = session.createProducer(queue);
			String payload ="You payement is recieved!";
			Message msg = session.createTextMessage(payload);
			System.out.println("Sending text :'"+ payload + "'");
			
			producer.send(msg);
			
			session.close();
			
		}finally {
			if (connection!= null) {
				connection.close();
			}
			
		}
	}

}
