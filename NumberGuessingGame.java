/*TASk 1: NUMBER GUESSING GAME
1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.*/

import java.util.Scanner;
import java.util.Random;

public class Task1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random randomnum = new Random();
        int soln = sc.nextInt(bound:100)+1;
        int try = 3;
        boolean correct = false;

        System.out.println("------------------------WELCOME TO A NUMBER GUESSING GAME!------------------------");
        
        while(try>0)
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
                System.out.println("Now you only have"+ " " + try-1 + " " + "trials left" );
                try--;
            }
            else if(guessedno<soln)
            {
                System.out.println("Oops! you guessed a lower number");
                System.out.println("Now you only have"+ " " + try-1 + " " + "trials left" );
                try--;
            }
           
        }
        if(correct == false)
            {
                System.out.println("Oops! You are out of traials");
            }
    }
    
    
}