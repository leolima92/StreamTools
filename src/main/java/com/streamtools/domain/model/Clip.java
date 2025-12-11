package com.streamtools.domain.model;

import java.time.Instant;

import com.streamtools.domain.model.enums.StreamingPlatform;

public class Clip {
    
    private long id;

    private Account account;

    private String title;

    private String url;

    private StreamingPlatform platform;

    private String game;
    
    private String tags;

    private Instant createdAt = Instant.now();
}
