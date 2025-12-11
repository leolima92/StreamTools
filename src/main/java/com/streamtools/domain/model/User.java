package com.streamtools.domain.model;

import java.time.Instant;

import com.streamtools.domain.model.enums.AuthProvider;
import com.streamtools.domain.model.enums.UserRole;


public class User {
    private long id;

    private String username;

    private String email;

    private String password;

    private AuthProvider authProvider = AuthProvider.LOCAL;

    private UserRole role = UserRole.MEMBER;

    private Account account;

    private Instant createdAt = Instant.now();
}
