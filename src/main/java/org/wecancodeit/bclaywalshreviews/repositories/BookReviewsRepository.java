package org.wecancodeit.bclaywalshreviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.bclaywalshreviews.models.BookReview;

import java.util.Collection;
import java.util.Optional;

public interface BookReviewsRepository extends CrudRepository<BookReview, Long> {
    Collection<BookReview> findAll();

    Optional<BookReview> findById(Long id);

    BookReview findByName(String name);
}
