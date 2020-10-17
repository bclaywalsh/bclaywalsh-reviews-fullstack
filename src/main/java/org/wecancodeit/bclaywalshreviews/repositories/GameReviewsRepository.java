package org.wecancodeit.bclaywalshreviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.bclaywalshreviews.models.GameReview;

import java.util.Collection;
import java.util.Optional;

public interface GameReviewsRepository extends CrudRepository<GameReview, Long> {
    Collection<GameReview> findAll();

    Optional<GameReview> findById(Long id);

    GameReview findByName(String name);
}
