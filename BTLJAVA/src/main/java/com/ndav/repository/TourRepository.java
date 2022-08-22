/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndav.repository;

import com.ndav.pojos.Comment;
import com.ndav.pojos.Tour;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public interface TourRepository {
    List<Tour> getTours(Map<String, String> params, int page);
    int countTour();
    Tour getTourById(long id);
    boolean addOrUpdate(Tour tour);
    boolean deleteTour(long id);
    List<Comment> getComments(long tourId);
    Comment addComment(String content, long tourId);
      
}
