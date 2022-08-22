/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndav.repository.imlp;

import com.ndav.pojos.Commentnews;
import com.ndav.pojos.MyNews;
import com.ndav.repository.NewsRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ADMIN
 */
@Repository
@Transactional
public class NewsRepositoryImlp implements NewsRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<MyNews> getListNews() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From News");
        return q.getResultList();
    }

    @Override
    public MyNews getNewsById(long id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(MyNews.class, id);
    }

    @Override
    public boolean deleteNews(long id) {
        {
            Session session = this.sessionFactory.getObject().getCurrentSession();

            try {
                MyNews n = session.get(MyNews.class, id);
                session.delete(n);
                return true;

            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }

        }
    }

    @Override
    public boolean addOrUpdateNews(MyNews news) {
       Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            session.flush();
            session.save(news);

            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Commentnews> getCommentnews(long newsid) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Commentnews> q = b.createQuery(Commentnews.class);
        Root root = q.from(Commentnews.class);
        q.select(root);

        q.where(b.equal(root.get("newsid"), newsid));

        Query query = session.createQuery(q);
        return query.getResultList();
    }

    @Override
    public Commentnews addComment(String content, long newsid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
