import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        // Create an instance of the GameService class
        GameService gameService = new GameService();

        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Number Guessing Game!");

        // Game loop
        int attempts = 0; // Track the number of attempts
        while (true) {
            System.out.println("Please enter your guess (or type 'exit' to quit):");
            String userInput = scanner.nextLine();

            // Check if user wants to exit the game
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break; // Exit the loop and end the game
            }

            try {
                // Parse the input as a double (the user's guess)
                double guess = Double.parseDouble(userInput);
                attempts++; // Increment attempt count

                // Check if the guess is correct
                if (gameService.checkGuess(guess)) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    break; // End the game after correct guess
                } else {
                    System.out.println("Wrong guess. Try again!");
                }

                // After 3 incorrect attempts, give a hint
                if (attempts == 3) {
                    System.out.println("It's a popular number in math. Please enter your guess (or type 'exit' to quit):");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}