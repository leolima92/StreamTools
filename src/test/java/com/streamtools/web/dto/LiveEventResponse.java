package com.streamtools.web.dto;

import java.time.LocalDateTime;

import com.streamtools.domain.model.enums.LiveStatus;
import com.streamtools.domain.model.enums.StreamingPlatform;

public record LiveEventResponse(
        Long id,
        Long accountId,
        String title,
        StreamingPlatform platform,
        String description,
        LocalDateTime scheduledAt,
        Integer plannedDurationMinutes,
        LiveStatus status,
        String game,
        String tags
) {}
