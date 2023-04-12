package com.task.clinked.service;

import com.task.clinked.model.Article;
import com.task.clinked.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Page<Article> listArticles(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }
}

