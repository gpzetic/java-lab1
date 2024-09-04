import java.lang.IllegalArgumentException;

public class VideoGame {

    private String name;
    private String release;
    private String genre;

    public VideoGame(String name, String release, String genre) {
        setName(name);
        setRelease(release);
        setGenre(genre);
    }

    public void setName(String name) {
        name = name.trim();
        if (name.length() == 0) {
            throw new IllegalArgumentException(
                "Name must be 1 or more characters"
            );
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRelease(String release) {
        release = release.trim();
        if (release.length() == 0) {
            throw new IllegalArgumentException(
                "Release date must be 1 or more characters"
            );
        }
        this.release = release;
    }

    public String getRelease() {
        return this.release;
    }

    public void setGenre(String genre) {
        genre = genre.trim();
        if (genre.length() == 0) {
            throw new IllegalArgumentException(
                "Genre must be 1 or more characters"
            );
        }
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public String toString() {
        return (
            getName() +
            ", Released on: " +
            getRelease() +
            ". Genre: " +
            getGenre()
        );
    }
}
