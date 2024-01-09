package movietheater.api.controller;

import movietheater.api.logic.MovieLogic;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import movietheater.api.model.Movie;

@Controller("/movies")
public class MovieController {

    private MovieLogic movieLogic = new MovieLogic();

    // curl localhost:8080/movies/dayOfWeek
    @Get("/{dayOfWeek}")
    public Movie getMovies(String dayOfWeek) {
        return movieLogic.getMovieListings(dayOfWeek);
    }
}
