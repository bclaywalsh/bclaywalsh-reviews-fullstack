package org.wecancodeit.bclaywalshreviews.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.bclaywalshreviews.models.MovieReview;
import org.wecancodeit.bclaywalshreviews.repositories.MovieReviewsRepository;

import javax.annotation.Resource;

@Controller
public class MovieReviewController {
    @Resource
    private MovieReviewsRepository movieReviewRepo;

    @RequestMapping({"/movieReviews","/",""})
    public String findAllReviews(Model model) {
        model.addAttribute("movieReviews", movieReviewRepo.findAll());
        return "movieReviewsView";
    }

    @RequestMapping("/movieReviews/{movieReview}")
    public String findOneReview(@PathVariable String movieReview, Model model){
        MovieReview retrievedMovieReview = movieReviewRepo.findByName(movieReview);
        model.addAttribute("movieReview", retrievedMovieReview);
        return "movieReviewView";

    }
}
