import java.util.Scanner; 
import java.util.Random;
public class NumberGuess {

    public static final int RANDOM_NUMBER = new Random().nextInt(100);

    /* Function to read user string input from console */
    public static String readString(String question){
        Scanner input = new Scanner(System.in);
        System.out.print(question);
        String response = input.next();
        return response;
    }
    
    /* Method to get name from user*/
    public static String getName(){
        String name = readString("Hello, what's your name? ");
        return name;   
    }

    /* Method to ask user if they would like to play game*/
    public static boolean willPlay(){
        System.out.print("Hi " + getName());
        String answer = readString(" Would you like to play guess the number? (y/n) ").toLowerCase();
        while (!answer.equals("y") && !answer.equals("n")) {
            answer = readString("Please enter either y or n ").toLowerCase();
        }
        System.out.println(answer.equals("y"));
        return answer.equals("y");   
    }

    

    public static void main(String[] args) {
        willPlay();
    }
}
