package org.wecancodeit.bclaywalshreviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.bclaywalshreviews.models.GameReview;
import org.wecancodeit.bclaywalshreviews.repositories.BookReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.GameReviewsRepository;
import org.wecancodeit.bclaywalshreviews.repositories.MovieReviewsRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private GameReviewsRepository gameReviewsRepos;

    @Autowired
    private BookReviewsRepository bookReviewsRepository;

    @Autowired
    private MovieReviewsRepository movieReviewsRepos;

    @Test
    public void gamesReposShouldHaveAListOfReviews() {
//        GameReview testGame1 = new GameReview(1L, "game1", "category", "image url", "studio", "overview", "content");
//        GameReview testGame2 = new GameReview(2L, "game2", "category", "image url", "studio", "overview", "content");
//        GameReview testGame3 = new GameReview(3L, "game3", "category", "image url", "studio", "overview", "content");

//        gameReviewsRepos.save(testGame1);
//        gameReviewsRepos.save(testGame2);
//        gameReviewsRepos.save(testGame3);
//
//        entityManager.flush();
//        entityManager.clear();
//
//        assertThat(gameReviewsRepos.findAll()).contains(testGame1, testGame2, testGame3);
    }
}
