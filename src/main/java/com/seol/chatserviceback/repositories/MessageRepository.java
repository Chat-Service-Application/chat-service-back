package com.seol.chatserviceback.repositories;

import java.time.LocalDateTime;
import java.util.List;

import com.seol.chatserviceback.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByChatroomId(Long chatroomId);

    Boolean existsByChatroomIdAndCreatedAtAfter(Long chatroomId, LocalDateTime createdAt);
}
