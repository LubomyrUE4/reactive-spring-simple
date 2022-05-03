package com.example.reactivedata.controller;

import com.example.reactivedata.domain.Message;
import com.example.reactivedata.domain.User;
import com.example.reactivedata.service.MessageService;
import com.example.reactivedata.service.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {
    private final MessageService messageService;
    private final UserService userService;

    public ReactiveController(MessageService messageService, UserService userService) {
        this.messageService = messageService;
        this.userService = userService;
    }

    @GetMapping("/messages")
    public Flux<Message> getMessages() {
        return messageService.findAllMessages();
    }

    @PostMapping("/messages")
    public Mono<Message> createMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @PostMapping("/register")
    public Mono<User> registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
