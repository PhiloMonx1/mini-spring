package com.hanghea99.minispring.repository;

import com.hanghea99.minispring.model.Article;
import com.hanghea99.minispring.model.Heart;
import com.hanghea99.minispring.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {



}
