package com.codegym.blog_application.repository;

import com.codegym.blog_application.model.BlogApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogApp,Integer> {
}
