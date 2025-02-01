package com.seol.chatserviceback.repositories;

import com.seol.chatserviceback.entities.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {

}
