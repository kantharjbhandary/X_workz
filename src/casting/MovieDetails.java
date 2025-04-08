package casting;

public class MovieDetails extends Movie {
    @Override
    public void genre() {
        System.out.println("Overridden: genre in MovieDetails");
    }

    @Override
    public void duration() {
        System.out.println("Overridden: duration in MovieDetails");
    }

    @Override
    public void language() {
        System.out.println("Overridden: language in MovieDetails");
    }

    @Override
    public void rating() {
        System.out.println("Overridden: rating in MovieDetails");
    }

    @Override
    public void releaseYear() {
        System.out.println("Overridden: releaseYear in MovieDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MovieDetails");
    }
}
