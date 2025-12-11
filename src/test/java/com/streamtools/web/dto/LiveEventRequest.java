package com.streamtools.web.dto;

import java.time.LocalDateTime;

import com.streamtools.domain.model.enums.StreamingPlatform;

public record LiveEventRequest(
        Long accountId,
        String title,
        StreamingPlatform platform,
        String description,
        LocalDateTime scheduledAt,
        Integer plannedDurationMinutes,
        String game,
        String tags
) {}
