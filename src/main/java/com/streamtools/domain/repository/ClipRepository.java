package com.streamtools.domain.repository;

import com.streamtools.domain.model.Account;
import com.streamtools.domain.model.Clip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClipRepository extends JpaRepository<Clip, Long> {

    List<Clip> findByAccount(Account account);
}
