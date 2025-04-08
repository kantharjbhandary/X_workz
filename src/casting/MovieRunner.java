package casting;

public class MovieRunner {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.genre();
        movie.duration();
        movie.language();
        movie.rating();
        movie.releaseYear();
        System.out.println("----------------------");

        Movie moviePoly = new MovieDetails();
        moviePoly.genre();
        moviePoly.duration();
        moviePoly.language();
        moviePoly.rating();
        moviePoly.releaseYear();
        System.out.println("----------------------");

        MovieDetails movieDetails = new MovieDetails();
        movieDetails.genre();
        movieDetails.duration();
        movieDetails.language();
        movieDetails.rating();
        movieDetails.releaseYear();
        movieDetails.extraMethod();
        System.out.println("----------------------");

        MovieCast movieCast = new MovieCast();
        movieCast.cast(moviePoly);
    }
}
