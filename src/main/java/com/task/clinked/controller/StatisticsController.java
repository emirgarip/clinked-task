package com.task.clinked.controller;

import com.task.clinked.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    private final StatisticsService statisticsService;


    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Map<LocalDate, Long>> getDailyArticleCounts() {
        Map<LocalDate, Long> dailyCounts = statisticsService.getDailyArticleCounts();
        return ResponseEntity.ok(dailyCounts);
    }
}

