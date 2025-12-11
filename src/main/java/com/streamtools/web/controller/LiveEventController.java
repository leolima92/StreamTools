package com.streamtools.web.controller;

import com.streamtools.domain.model.LiveEvent;
import com.streamtools.domain.repository.LiveEventRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lives")
public class LiveEventController {

    private final LiveEventRepository liveEventRepository;

    public LiveEventController(LiveEventRepository liveEventRepository) {
        this.liveEventRepository = liveEventRepository;
    }

    @GetMapping
    public List<LiveEvent> listAll() {
        return liveEventRepository.findAll();
    }
}
