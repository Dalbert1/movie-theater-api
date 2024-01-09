package movietheater.api.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

@Data
@Serdeable
public class Movie {
    private String name;
    private String director;
    private String releaseDate;
    private String showingTimes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getShowingTimes() {
        return showingTimes;
    }

    public void setShowingTimes(String showingTimes) {
        this.showingTimes = showingTimes;
    }

    public String getShowingDay() {
        return showingDay;
    }

    public void setShowingDay(String showingDay) {
        this.showingDay = showingDay;
    }

    private String showingDay;
}
