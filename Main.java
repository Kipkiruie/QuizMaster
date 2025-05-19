import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions matrix
        String[][] questions = {
                {"\"What is your name?\"", "\"How old are you?\"", "\"Where do you live?\""},
                {"\"What is your favorite color?\"", "\"What is your hobby?\"", "\"What is your profession?\""},
                {"\"What is your dream job?\"", "\"What is your favorite food?\"", "\"What is your favorite sport?\""}
        };

        // Options matrix
        String[][] options = {
                {
                        "1. John  2. Alex  3. Elisha", // Correct: 3
                        "1. 20  2. 25  3. 30",        // Correct: 2
                        "1. New York  2. Nairobi  3. London" // Correct: 2
                },
                {
                        "1. Red  2. Blue  3. Green",      // Correct: 2
                        "1. Reading  2. Cooking  3. Traveling", // Correct: 1
                        "1. Doctor  2. Engineer  3. Tinter"     // Correct: 3
                },
                {
                        "1. Software Engineer  2. Artist  3. Teacher", // Correct: 1
                        "1. Pizza  2. Sushi  3. Burger",                // Correct: 1
                        "1. Football  2. Basketball  3. Cricket"        // Correct: 1
                }
        };

        // Correct answers matrix (index-based answers)
        int[][] correctAnswers = {
                {3, 2, 2}, // Correct options for row 1
                {2, 1, 3}, // Correct options for row 2
                {1, 1, 1}  // Correct options for row 3
        };

        int score = 0; // To track the score
        System.out.println("*******************************************");
        System.out.println("Welcome to the Question and Answer Program!");
        System.out.println("*******************************************");

        // Loop through questions and their options
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.println("Question: " + questions[i][j]);
                System.out.println("Choices: " + options[i][j]);
                System.out.print("Enter your guess (1, 2, or 3): ");
                int guess = scanner.nextInt();

                // Check if the guess is correct
                if (guess == correctAnswers[i][j]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was option " + correctAnswers[i][j] + ".\n");
                }
            }
        }

        // Display the final score
        System.out.println("*******************************************");
        System.out.println("Quiz Completed!");
        System.out.println("Your final score is: " + score + "/" + (questions.length * questions[0].length));
        System.out.println("*******************************************");

        scanner.close();
    }
}
