/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndav.service;

import com.ndav.pojos.Commentnews;
import com.ndav.pojos.MyNews;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NewsService {

    List<MyNews> getListNews();

    MyNews getNewsById(long id);

    boolean deleteNews(long id);

    boolean addOrUpdateNews(MyNews news);

    List<Commentnews> getCommentnews(long newsid);

    Commentnews addComment(String content, long newsid);

}
