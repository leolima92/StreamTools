package com.streamtools.domain.repository;

import com.streamtools.domain.model.Account;
import com.streamtools.domain.model.LiveEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LiveEventRepository extends JpaRepository<LiveEvent, Long> {

    List<LiveEvent> findByAccount(Account account);
}
