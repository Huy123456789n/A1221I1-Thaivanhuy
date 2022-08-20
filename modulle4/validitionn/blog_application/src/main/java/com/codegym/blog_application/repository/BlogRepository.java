package com.codegym.blog_application.repository;

import com.codegym.blog_application.model.BlogApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<BlogApp,Integer> {
    Page<BlogApp> findAllByNameContaining(String firstname, Pageable pageable);
}
