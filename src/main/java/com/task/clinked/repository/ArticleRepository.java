package com.task.clinked.repository;

import com.task.clinked.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("SELECT COUNT(a) FROM Article a WHERE a.datePublished = :date")
    Long countByDatePublished(@Param("date") LocalDate date);
}

