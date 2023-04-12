package com.task.clinked.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Size(max = 100)
    String title;

    @NotNull
    String author;

    @NotNull
    @Column(columnDefinition = "TEXT")
    String content;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate datePublished;

}

