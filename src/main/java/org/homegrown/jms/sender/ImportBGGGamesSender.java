package org.homegrown.jms.sender;

import org.homegrown.domain.xml.Boardgame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.*;
import java.util.Enumeration;

/**
 * Created by JoLe on 04/05/15.
 */
@Component("messageSender")
public class ImportBGGGamesSender implements MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void sendMessage(final String message){
        this.jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }

    @Override
    public void sendMessage(final Boardgame bggGame){
        this.jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(bggGame);
            }
        });
    }

}
