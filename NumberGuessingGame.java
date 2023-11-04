
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random randomnum = new Random();
        int soln = randomnum.nextInt(100)+1;
        int trial = 3;
        boolean correct = false;

        System.out.println("------------------------WELCOME TO A NUMBER GUESSING GAME!------------------------");
        
        while(trial>0)
        {
            System.out.println("GUESS A NUMBER BETWEEN 1 to 100...(within 3 trials only)");
            int guessedno = sc.nextInt();
            if(guessedno == soln)
            {
                 System.out.println("Congratulations! Your Guess was Correct You win this game!!");
                 break;
            }
            else if(guessedno>soln)
            {
                System.out.println("Oops! you guessed a higher number");
                System.out.println("Now you only have"+ " " + (trial-1) + " " + "trials left" );
                trial--;
            }
            else if(guessedno<soln)
            {
                System.out.println("Oops! you guessed a lower number");
                System.out.println("Now you only have"+ " " + (trial-1) + " " + "trials left" );
                trial--;
            }
           
        }
        if(correct == false)
            {
                System.out.println("Oops! You are out of traials");
            }
    }
    
    
}