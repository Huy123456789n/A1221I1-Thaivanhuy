package com.codegym.blog_application.service;

import com.codegym.blog_application.model.BlogApp;
import com.codegym.blog_application.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<BlogApp> findAll(Pageable pageable) {
        return blogRepository.findAll( pageable);
    }
    @Override
    public Optional<BlogApp> findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(BlogApp blogApp) {
                blogRepository.save(blogApp);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

//    @Override
//    public Page<BlogApp> findAllByFirstNameContaining(String firstname, Pageable pageable) {
//        return blogRepository.findAllByFirstNameContaining(firstname, pageable);
//    }
}
