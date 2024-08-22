package com.metropolitan.sevices;

import com.metropolitan.models.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {
    @JmsListener(destination = "messageQueue")
    public void receiveMessage(Message message) {
    System.out.println("Received message: " + message);
    }
}
