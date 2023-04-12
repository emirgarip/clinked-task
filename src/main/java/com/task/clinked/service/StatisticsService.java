package com.task.clinked.service;

import com.task.clinked.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class StatisticsService {

    private final ArticleRepository articleRepository;

    public Map<LocalDate, Long> getDailyArticleCounts() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(6);

        Map<LocalDate, Long> dailyCounts = new HashMap<>();
        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            Long count = articleRepository.countByDatePublished(date);
            dailyCounts.put(date, count);
        }

        return dailyCounts;
    }
}
