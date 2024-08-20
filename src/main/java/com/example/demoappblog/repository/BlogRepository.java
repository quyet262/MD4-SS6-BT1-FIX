package com.example.demoappblog.repository;

import com.example.demoappblog.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Transactional
@Repository
public class BlogRepository implements IBlogRepository {

    @Override
    public List<Blog> findAll() {
        return Collections.emptyList();
    }
}
