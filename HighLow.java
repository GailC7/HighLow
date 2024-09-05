
import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

       //Variables
        int guessNumber;
        guessNumber = random.nextInt(10)+1; 
        //Plus one to take out the number 0
        int yourNumber;
        String messageToComputer;
        boolean control = false;

        do{
            System.out.println("Enter a number between 1-10 for the computer to guess...");
            yourNumber = kb.nextInt();

            System.out.println("Is the number " + guessNumber + " ?");
            System.out.println("Yes or No?");
            messageToComputer = kb.toString();

            if(guessNumber != yourNumber)
            

        }while (control == false); 
    }
    

}