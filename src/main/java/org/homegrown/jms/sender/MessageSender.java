package org.homegrown.jms.sender;

import org.homegrown.domain.xml.Boardgame;

/**
 * Created by JoLe on 04/05/15.
 */
public interface MessageSender {

    void sendMessage(final String message);

    void sendMessage(final Boardgame bggGame);

}
