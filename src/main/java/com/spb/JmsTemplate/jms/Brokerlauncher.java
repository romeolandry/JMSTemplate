package com.spb.JmsTemplate.jms;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class Brokerlauncher {

	public static void main(String[] args) throws URISyntaxException, Exception {
		// TODO Auto-generated method stub
		BrokerService broker = BrokerFactory.createBroker(new URI(
				"broker:(tcp://localhost:61616)"));
		broker.start();
	}

}
