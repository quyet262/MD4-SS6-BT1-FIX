package com.example.demoappblog.service;

import com.example.demoappblog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
}
