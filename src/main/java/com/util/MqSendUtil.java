package com.util;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MqSendUtil {
	
	private  ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	private  JmsTemplate jmsTemplate = (JmsTemplate) ac.getBean("jmsTopicTemplate");
	
	public void send(final String message){
        
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage msg = session.createTextMessage();
                msg.setText(message);
                System.out.println("发送数据++++++++++++发送数据:"+message);
                return msg;
            }
        });
    }
}
