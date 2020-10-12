package org.wecancodeit.bclaywalshreviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MovieReview {

    @Id
    @GeneratedValue
    private Long id;
    private String overview;
    private String content;
    private String name;
    private String director;
    private String image;
    private String category;

    protected MovieReview() {
    }

    public MovieReview(long id, String name, String category, String image, String director, String overview, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.image = image;
        this.director = director;
        this.category = category;
        this.overview = overview;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getAuthor() {
        return director;
    }

    public void setAuthor(String director) {
        this.director = director;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieReview that = (MovieReview) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
