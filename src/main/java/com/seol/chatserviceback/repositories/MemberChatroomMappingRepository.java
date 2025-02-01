package com.seol.chatserviceback.repositories;

import java.util.List;
import java.util.Optional;

import com.seol.chatserviceback.entities.MemberChatroomMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberChatroomMappingRepository extends JpaRepository<MemberChatroomMapping, Long> {

    Boolean existsByMemberIdAndChatroomId(Long memberId, Long chatroomId);

    void deleteByMemberIdAndChatroomId(Long memberId, Long chatroomId);

    List<MemberChatroomMapping> findAllByMemberId(Long memberId);

    Optional<MemberChatroomMapping> findByMemberIdAndChatroomId(Long memberId, Long chatroomId);
}
