package casting;

public class MovieCast {
    public void cast(Movie movie) {
        System.out.println("Casting Movie");
        movie.genre();
        movie.duration();
        movie.language();
        movie.rating();
        movie.releaseYear();
        if(movie instanceof MovieDetails) {
            MovieDetails ref = (MovieDetails)movie;
            ref.extraMethod();
        }
    }
}
