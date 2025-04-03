package parent.child.external;

import parent.child.internal.ActionMovie;
import parent.child.internal.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.releaseYear();
        movie.rating();
        movie.genre();
        movie.duration();
        movie.language();

        ActionMovie actionMovie=new ActionMovie();
        actionMovie.releaseYear();
        actionMovie.rating();
        actionMovie.genre();
        actionMovie.duration();
        actionMovie.language();

        Movie movie1=new ActionMovie();
        movie1.releaseYear();
        movie1.rating();
        movie1.genre();
        movie1.duration();
        movie1.language();

    }
}
