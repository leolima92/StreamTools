package com.streamtools.domain.model;

import java.time.Instant;
import java.time.LocalDateTime;

import com.streamtools.domain.model.enums.LiveStatus;
import com.streamtools.domain.model.enums.StreamingPlatform;

public class LiveEventer {
    
    private long id;

    private Account account;  

    private String title;

    private StreamingPlatform platform;

    private String description;

    private LocalDateTime scheduledAt;

    private Integer plannedDurationMinutes;
    
    private LiveStatus status = LiveStatus.PLANNED;

    private String game;

    private String tags;

    private Instant createdAt = Instant.now();

    private Instant updatedAt;
}
