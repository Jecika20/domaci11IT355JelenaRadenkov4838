package com.metropolitan.sevices;

import com.metropolitan.models.Message;
import com.metropolitan.models.MessageEntity;
import com.metropolitan.repositories.MessageEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private MessageEntityRepository messageRepository;


    public void sendMessage(Message message) {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setContent(message.getContent());
        messageEntity.setType(message.getType());
        messageRepository.save(messageEntity);
        jmsTemplate.convertAndSend("messageQueue",message);
    }
}
