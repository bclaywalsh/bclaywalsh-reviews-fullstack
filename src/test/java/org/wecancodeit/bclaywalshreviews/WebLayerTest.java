//package org.wecancodeit.bclaywalshreviews;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.wecancodeit.bclaywalshreviews.models.BookReview;
//import org.wecancodeit.bclaywalshreviews.models.GameReview;
//import org.wecancodeit.bclaywalshreviews.models.MovieReview;
//import org.wecancodeit.bclaywalshreviews.repositories.BookReviewsRepository;
//import org.wecancodeit.bclaywalshreviews.repositories.GameReviewsRepository;
//import org.wecancodeit.bclaywalshreviews.repositories.MovieReviewsRepository;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest
//public class WebLayerTest {
//
//    @MockBean
//    private GameReviewsRepository gameRepos;
//
//    @MockBean
//    private MovieReviewsRepository movieRepos;
//
//    @MockBean
//    private BookReviewsRepository bookRepos;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void gamesShouldBeOkAndReturnGamesViewWithGamesModelAttribute() throws Exception {
//        mockMvc.perform(get("/gameReviews"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("gameReviewsView"))
//                .andExpect(model().attributeExists("gameReviews"));
//    }
//
//    @Test
//    public void booksShouldBeOkAndReturnBooksViewWithBooksModelAttribute() throws Exception {
//        mockMvc.perform(get("/bookReviews"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("bookReviewsView"))
//                .andExpect(model().attributeExists("bookReviews"));
//    }
//
//    @Test
//    public void moviesShouldBeOkAndReturnMoviesViewWithMoviesModelAttribute() throws Exception {
//        mockMvc.perform(get("/movieReviews"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("movieReviewsView"))
//                .andExpect(model().attributeExists("movieReviews"));
//    }
//
//    @Test
//    public void shouldBeOkayForASingleGameEndpointWithGameReviewAndGameModelAttribute() throws Exception{
//        GameReview testGameReview = new GameReview(1L,"name","cat","img","studio","overview","content");
//        gameRepos.save(testGameReview);
//        when(gameRepos.findByName("name")).thenReturn(testGameReview);
//        mockMvc.perform(get("/gameReviews/name"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("gameReviewView"))
//                .andExpect(model().attributeExists("gameReview"));
//    }
//
//    @Test
//    public void shouldBeOkayForASingleMovieEndpointWithMovieReviewAndMovieModelAttribute() throws Exception{
//        MovieReview testMovieReview = new MovieReview(1L,"name","cat","img","studio","overview","content");
//        movieRepos.save(testMovieReview);
//        when(movieRepos.findByName("name")).thenReturn(testMovieReview);
//        mockMvc.perform(get("/movieReviews/name"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("movieReviewView"))
//                .andExpect(model().attributeExists("movieReview"));
//    }
//
//    @Test
//    public void shouldBeOkayForASingleBookEndpointWithBookReviewAndBookModelAttribute() throws Exception{
//        BookReview testBookReview = new BookReview(1L,"name","cat","img","studio","overview","content");
//        bookRepos.save(testBookReview);
//        when(bookRepos.findByName("name")).thenReturn(testBookReview);
//        mockMvc.perform(get("/bookReviews/name"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("bookReviewView"))
//                .andExpect(model().attributeExists("bookReview"));
//    }
//
//
//}
