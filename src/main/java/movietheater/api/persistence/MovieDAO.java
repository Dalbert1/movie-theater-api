package movietheater.api.persistence;

import jakarta.inject.Singleton;
import movietheater.api.model.Movie;

@Singleton
public class MovieDAO {
    public Movie getMoviesDayOfWeek(String dayOfWeek) {

        Movie myMovie = new Movie();
        myMovie.setDirector("Austin Albert");
        myMovie.setName("Interstellar");
        myMovie.setReleaseDate("2002");
        myMovie.setShowingTimes("7:30 PM");
        myMovie.setShowingDay(dayOfWeek);

        return myMovie;
    }
}
