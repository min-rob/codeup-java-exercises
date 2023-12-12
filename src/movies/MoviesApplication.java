package movies;
import utils.Input;
import java.util.*;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - Exit\n1 - View all movies\n2 - View animated movies\n3 - View drama movies\n4 - View movies in horror category\n5 - View Sci-fi movies");
        Input input = new Input();

        int userChoice = input.getInt(0, 5);
        boolean userContinue = true;

        for (Movie movie : MoviesArray.findAll()) {
            switch (userChoice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(movie.getName() + movie.getCategory());
                    break;
                case 2:
                    if (movie.getCategory() == "animated") {
                        System.out.println(movie.getName());
                    }
                    break;
                case 3:
                    if (movie.getCategory() == "drama") {
                        System.out.println(movie.getName());
                    }
                    break;
                case 4:
                    if (movie.getCategory() == "horror") {
                        System.out.println(movie.getName());
                    }
                    break;
                case 5:
                    if (movie.getCategory() == "scifi") {
                        System.out.println(movie.getName());
                    }
                    break;
            }
        }
    }
}