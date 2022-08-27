package com.codegym.blog_application.service;

import com.codegym.blog_application.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService extends  IGeneralService<Category>{
    List<Category> findAllCate();
}
