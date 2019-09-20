# JMSTemplate
ich folge hier das Spring [Framework Cookbook tutorial](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=2ahUKEwjW5smIoNrkAhV066YKHaTrBUwQFjAAegQIBBAC&url=https%3A%2F%2Fwww.javacodegeeks.com%2Fwp-content%2Fuploads%2F2017%2F01%2FSpring-Framework-Cookbook.pdf&usg=AOvVaw1DUxESS8OQU8GTPzKSyixi)

JMSTemplate hilft dazu, dass die Klassen Nachrichten einfach senden und empfangen.
##### Send/receive message with JmsTemplate
To send a message with JmsTemplate we still need to open the connection with Broker
	Load application context
	Get producer bean from spring container
	Send the message with the message
	Get the consumer bean from spring container
	Use the consomer to receive messages. 
	