package org.homegrown.jms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by JoLe on 04/05/15.
 */
@Component("messageSender")
public class ImportBGGGamesSender implements MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void sendMessage(final String message){

    }
}
