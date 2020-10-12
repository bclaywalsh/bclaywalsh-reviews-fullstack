package org.wecancodeit.bclaywalshreviews.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.bclaywalshreviews.models.BookReview;
import org.wecancodeit.bclaywalshreviews.repositories.BookReviewsRepository;

import javax.annotation.Resource;

@Controller
public class BookReviewController {
    @Resource
    private BookReviewsRepository bookReviewRepo;

    @RequestMapping({"/bookReviews","/",""})
    public String findAllReviews(Model model) {
        model.addAttribute("bookReviews", bookReviewRepo.findAll());
        return "bookReviewsView";
    }

    @RequestMapping("/bookReviews/{bookReview}")
    public String findOneReview(@PathVariable String bookReview, Model model){
        BookReview retrievedBookReview = bookReviewRepo.findByName(bookReview);
        model.addAttribute("bookReview", retrievedBookReview);
        return "bookReviewView";

    }
}
