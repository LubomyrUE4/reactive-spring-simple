package com.example.reactivedata.repo;

import com.example.reactivedata.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}
