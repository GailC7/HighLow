
import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

       //Variables
        int guessNumber;
        int theNumber;
        //Plus one to take out the number 0
        int yourNumber;
        String messageToComputer;
        int counter = 0;
        boolean control = false;
        boolean guessControl= false;

        do{
            //Random number for computer to guess
            theNumber = random.nextInt(10)+1;
            System.out.println("The number for the computer to guess is " + theNumber);

            do
            {
                //Random number guesser and question
                guessNumber = random.nextInt(10)+1; 
                System.out.println("Is the number " + guessNumber + " ?");
                counter++;

                if(guessNumber > theNumber) //Too high
                {
                    messageToComputer = guessNumber + " is too high. Please guess again...";
                }
                else if (guessNumber < theNumber) //Too low
                {
                    messageToComputer = guessNumber + " is too low. Please guess again...";
                }
                else //The number guessed by the computer is correct
                {
                    messageToComputer = guessNumber + " is the correct number!! Yay!" + " This took " + counter +" attempts." ;

                    guessControl = true;
                    control = true;
                }

                //Prints the message to the computer
                System.out.println(messageToComputer);

            }while (guessControl == false);

        }while (control == false);  //End of loop
    }
    

}