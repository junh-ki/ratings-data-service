package io.msa.ratingsdataservice.models;

import java.util.List;

public class UserRating {

    private final List<Rating> userRatings;

    public UserRating(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }

    public List<Rating> getUserRatings() {
        return userRatings;
    }

}
