package org.wecancodeit.bclaywalshreviews.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.bclaywalshreviews.models.GameReview;
import org.wecancodeit.bclaywalshreviews.repositories.GameReviewsRepository;

import javax.annotation.Resource;

@Controller
public class GameReviewController {
    @Resource
    private GameReviewsRepository gameReviewRepo;

    @RequestMapping({"/gameReviews","/",""})
    public String findAllReviews(Model model) {
        model.addAttribute("gameReviews", gameReviewRepo.findAll());
        return "gameReviewsView";
    }

    @GetMapping("/gameReviews/{gameReview}")
    public String findOneReview(@PathVariable String gameReview, Model model){
        GameReview retrievedGameReview = gameReviewRepo.findByName(gameReview);
        model.addAttribute("gameReview", retrievedGameReview);
        return "gameReviewView";

    }
}
