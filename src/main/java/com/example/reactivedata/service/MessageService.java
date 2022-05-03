package com.example.reactivedata.service;

import com.example.reactivedata.domain.Message;
import com.example.reactivedata.repo.MessageRepo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {
    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Flux<Message> findAllMessages() {
        return messageRepo.findAll();
    }

    public Mono<Message> saveMessage(Message message) {
        return messageRepo.save(message);
    }

}
