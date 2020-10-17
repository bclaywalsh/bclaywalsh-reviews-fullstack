package org.wecancodeit.bclaywalshreviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.bclaywalshreviews.models.GameReview;
import org.wecancodeit.bclaywalshreviews.models.MovieReview;

import java.util.Collection;
import java.util.Optional;

public interface MovieReviewsRepository extends CrudRepository<MovieReview, Long> {
    Collection<MovieReview> findAll();

    Optional<MovieReview> findById(Long id);

    MovieReview findByName(String name);
}
