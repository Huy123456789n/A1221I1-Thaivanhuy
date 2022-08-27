package com.codegym.blog_application.service;

import com.codegym.blog_application.model.BlogApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService extends IGeneralService<BlogApp>{
    Page<BlogApp> findAllByNameContaining(String firstname, Pageable pageable);
    List<BlogApp> findAllBlog();


}
