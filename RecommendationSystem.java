import java.util.*;

public class RecommendationSystem {

    // Movie class with title and genre
    static class Movie {
        String title;
        String genre;

        Movie(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }
    }

    public static void main(String[] args) {
        // Step 1: Movie database
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", "Sci-Fi"),
                new Movie("The Dark Knight", "Action"),
                new Movie("Interstellar", "Sci-Fi"),
                new Movie("Titanic", "Romance"),
                new Movie("The Notebook", "Romance"),
                new Movie("Avengers", "Action"),
                new Movie("Coco", "Animation"),
                new Movie("Toy Story", "Animation")
        );

        // Step 2: Ask user for preference
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite genre (e.g., Action, Sci-Fi, Romance, Animation): ");
        String userPreference = sc.nextLine().trim();

        // Step 3: Recommend movies
        System.out.println("\nRecommended Movies for you:");
        for (Movie movie : movies) {
            if (movie.genre.equalsIgnoreCase(userPreference)) {
                System.out.println(" - " + movie.title + " (" + movie.genre + ")");
            }
        }

        // Step 4: If no match found
        System.out.println("\nOther popular movies you might like:");
        for (Movie movie : movies) {
            if (!movie.genre.equalsIgnoreCase(userPreference)) {
                System.out.println(" - " + movie.title + " (" + movie.genre + ")");
            }
        }
    }
}
