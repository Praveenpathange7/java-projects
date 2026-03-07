import java.util.*;
public class Guessing_Number {
    public static void main(String[] args) {
        Random rand = new Random();
        int NumbertoGuess = rand.nextInt(100)+1;
        int NumberofTries = 0;
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        while(!found){
            System.out.println("Enter the number between 1 to 100 : ");
            int guess = sc.nextInt();
            NumberofTries++;
            if(guess == NumbertoGuess){
                found = true;
            }
            else if(guess > NumbertoGuess){
                System.out.println("Your guess is too high");
            } else{
                System.out.println("Your guess is too Low");
            }
        }
        System.out.println("--- You Win ---");
        System.out.println("The number you have guessed : "+NumbertoGuess);
        System.out.println("You took "+NumberofTries+ " attempts to guess the number.");

    }
}
