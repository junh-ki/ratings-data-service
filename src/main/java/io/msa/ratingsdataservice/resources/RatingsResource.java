package io.msa.ratingsdataservice.resources;

import io.msa.ratingsdataservice.models.Rating;
import io.msa.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        return new UserRating(Arrays.asList(new Rating("550", 4), new Rating("551", 3)));
    }

}
