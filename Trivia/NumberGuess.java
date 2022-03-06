import java.util.Scanner; 
public class NumberGuess {
    
    /* Method to get name from user*/
    public static String getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String response = input.next();
        input.close();
        return response;   
    }

    /* Method to ask user if they would like to play game*/
    public static void askToPlay(){
        
    }

    public static void main(String[] args) {
        
    }
}
