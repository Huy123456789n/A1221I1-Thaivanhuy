package com.codegym.blog_application.repository;

import com.codegym.blog_application.model.BlogApp;
import com.codegym.blog_application.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {

//    Page<BlogApp> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
