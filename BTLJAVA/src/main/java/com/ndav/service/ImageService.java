/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ndav.service;

import com.ndav.pojos.Image;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ImageService {
    Image getImageById(long id);
    List<Image> getListImage(long id);
}
