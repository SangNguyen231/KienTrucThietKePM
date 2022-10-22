package com.example.OnGK.activemq;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.BasicConfigurator;
import org.springframework.stereotype.Service;

@Service
public class ActiveMQ {
	public static void main(String[] args) throws Exception{
		BasicConfigurator.configure();
		//config environment for JNDI
		Properties settings=new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
				"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		//create context
		Context ctx=new InitialContext(settings);
		//lookup JMS connection factory
		ConnectionFactory factory=
				(ConnectionFactory)ctx.lookup("TopicConnectionFactory");
		//lookup destination. (If not exist-->ActiveMQ create once)
		Destination destination=
				(Destination) ctx.lookup("dynamicTopics/sangnguyen");
		Destination destination1=
				(Destination) ctx.lookup("dynamicTopics/dauthi");
		//get connection using credential
		Connection con=factory.createConnection("admin","admin");
		//connect to MOM
		con.start();
		//create session
		Session session=con.createSession(
				/*transaction*/false,
				/*ACK*/Session.AUTO_ACKNOWLEDGE
				);
		//create producer
		MessageConsumer receiver = session.createConsumer(destination);
		
		receiver.setMessageListener(new MessageListener() {			
			public void onMessage(Message msg) {
				try {
					if (msg instanceof TextMessage) {
						TextMessage tm = (TextMessage) msg;
						String txt = tm.getText();						
						System.out.println(txt);
						msg.acknowledge();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}	
