package streams;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String title;
    private int likes;
    private Genre genre;


    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return 0;
    }

    public Genre getGenre() {
        return genre;
    }
}
