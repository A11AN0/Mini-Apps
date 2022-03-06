package packages;
import java.util.Scanner;
import java.util.Random;


public class MainPackageClass {
    public static Scanner input = new Scanner(System.in);

    /* Function to read user string input from console */
    public static String readString(String question) { 
        System.out.print(question);
        String response = input.next();
        return response;
    }


    /* Method to get name from user */
    public static String getName() {
        String name = readString("Hello, what's your name? ");
        return name;
    }

    /* Method to ask user if they would like to play game */
    public static boolean willPlay(String name, String question) {
        System.out.println("Yo " + name);
        String answer = readString(question + " ? (y/n) ").toLowerCase();
        while (!answer.equals("y") && !answer.equals("n")) {
            answer = readString("Please enter either y or n ").toLowerCase();
        }
        return answer.equals("y");
    }

    /* The main number guessing game */
    public static void game(int randomNumber) {
        int guess = (int) Math.round(Double.parseDouble(readString("Guess a number between 0 and 100: ")));
        while (guess != randomNumber) {
            if (guess > randomNumber)
                System.out.println("Hmm, the number I'm thinking of is lower than " + guess);
            else {
                System.out.println("Hmm, the number I'm thinking of is higher than " + guess);
            }
            guess = (int) Math.round(Double.parseDouble(readString("Try guessing again! ")));
        }
        System.out.println("Nice, the number I was thinking of is " + randomNumber);
    }

    /* The main program */
    public static void program() {
        String name = getName();
        boolean isPlaying = willPlay(name, "Would you like to play Number Guesser");
        while (isPlaying) {
            game(new Random().nextInt(100));
            isPlaying = willPlay(name, "Would you like to play Number Guesser again");
        }
        System.out.println("Thanks for stopping by!");
    }
}