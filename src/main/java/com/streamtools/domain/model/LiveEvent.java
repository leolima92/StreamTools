package com.streamtools.domain.model;

import com.streamtools.domain.model.enums.LiveStatus;
import com.streamtools.domain.model.enums.StreamingPlatform;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "live_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LiveEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_live_events_account"))
    private Account account;

    @Column(nullable = false, length = 200)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StreamingPlatform platform;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private LocalDateTime scheduledAt;

    private Integer plannedDurationMinutes;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private LiveStatus status = LiveStatus.PLANNED;

    @Column(length = 120)
    private String game;

    @Column(length = 255)
    private String tags;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    private Instant updatedAt;
}