package movietheater.api.logic;

import movietheater.api.model.Movie;
import movietheater.api.persistence.MovieDAO;

public class MovieLogic {

    private final MovieDAO movieDAO = new MovieDAO();

    public Movie getMovieListings(String dayOfWeek) {
        return movieDAO.getMoviesDayOfWeek(dayOfWeek);
    }
}
