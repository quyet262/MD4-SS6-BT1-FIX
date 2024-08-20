package com.example.demoappblog.repository;

import com.example.demoappblog.model.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();
}
