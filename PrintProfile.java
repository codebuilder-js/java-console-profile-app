import java.util.Scanner;

public class PrintProfile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Favorite food: ");
            String favoriteFood = scanner.nextLine();

            System.out.print("Favorite quote: ");
            String quote = scanner.nextLine();

            printProfile(name, age, favoriteFood, quote);
        }
    }

    public static void printProfile(
        String name,
        int age,
        String favoriteFood,
        String favoriteQuote
    ) {
        System.out.println("\n--- PROFILE ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Favorite food: " + favoriteFood);
        System.out.println("Favorite quote: \"" + favoriteQuote + "\"");
    }
}
