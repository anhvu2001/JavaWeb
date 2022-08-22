/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndav.controller;

import com.ndav.service.ImageService;
import com.ndav.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ADMIN
 */
@Controller
@ControllerAdvice
@PropertySource("classpath:messages.properties")
public class TourController {

    @Autowired
    private TourService tourService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/tour/{tourId}")
    public String detail(Model model, @PathVariable(value = "tourId") long tourId, @PathVariable(value="tourId") long iamgeIdtour) {
        model.addAttribute("tour", this.tourService.getTourById(tourId));
        model.addAttribute("imageid", this.imageService.getImageById(tourId));
        model.addAttribute("name", "welcome" + iamgeIdtour);
        model.addAttribute("image", this.imageService.getListImage(iamgeIdtour));
        return "tourDetail";
    }

}
