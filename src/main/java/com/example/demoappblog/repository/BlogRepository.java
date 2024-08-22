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
//@Repository
public class BlogRepository implements IBlogRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = em.createQuery("select b from Blog b", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        if (id == null) return null;
      return  em.find(Blog.class, id);
    }

    @Override
    public void save(Blog blog) {
       if(blog.getId() != null) {
           em.merge(blog);
       }else {
           em.persist(blog);
       }
    }

    @Override
    public void delete(Long id) {
        Blog blog = findById(id);
        if (blog != null) em.remove(blog);
    }
}
