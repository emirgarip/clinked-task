package com.task.clinked.controller;

import com.task.clinked.model.Article;
import com.task.clinked.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RequiredArgsConstructor
@RequestMapping("/articles")
@RestController
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<Article> createArticle(@Valid @RequestBody Article article) {
        Article createdArticle = articleService.createArticle(article);
        return ResponseEntity.created(URI.create("/articles/" + createdArticle.getId())).body(createdArticle);
    }

    @GetMapping
    public ResponseEntity<Page<Article>> listArticles(@PageableDefault(size = 10) Pageable pageable) {
        Page<Article> articles = articleService.listArticles(pageable);
        return ResponseEntity.ok(articles);
    }
}

