package com.codegym.blog_application.repository;

import com.codegym.blog_application.model.BlogApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogApp,Integer> {

//    Page<BlogApp> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
