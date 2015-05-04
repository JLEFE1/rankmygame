package org.homegrown.jms.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by JoLe on 04/05/15.
 */
public class ImportBGGGamesListener implements MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(ImportBGGGamesListener.class);

    @Override
    public void onMessage(Message message) {

        TextMessage textMessage = (TextMessage) message;

        try {
            logger.info("Message received: " + textMessage.getText());
        } catch (JMSException e){
            logger.error("JMS error", e);
        }

    }
}
