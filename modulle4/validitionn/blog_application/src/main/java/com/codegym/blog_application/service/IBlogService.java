package com.codegym.blog_application.service;

import com.codegym.blog_application.model.BlogApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBlogService extends IGeneralService<BlogApp>{
//    Page<BlogApp> findAllByFirstNameContaining(String firstname, Pageable pageable);


}
