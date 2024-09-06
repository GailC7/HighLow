import java.util.Random;

public class HighLow {
    public static void main(String[] args)
    {
        Random random = new Random();

       //Variables
        int guessNumber;
        int theNumber;
        String messageToComputer;
        int counter = 0;
        boolean control = false;
        boolean guessControl= false;

        do{
            //Random number for computer to guess
            theNumber = random.nextInt(10)+1; //Plus one to take out the number 0
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~");
            System.out.println("The number for the computer to guess is " + theNumber);
            System.out.println("~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("            \r\n" + //
                                "█▀▀ █░█ █▀▀ █▀ █▀ █ █▄░█ █▀▀   █▄▄ █▀▀ █▀▀ █ █▄░█ █▀\r\n" + //
                                "█▄█ █▄█ ██▄ ▄█ ▄█ █ █░▀█ █▄█   █▄█ ██▄ █▄█ █ █░▀█ ▄█\r\n" + //
                                " ");

            do
            {
                //Random number guesser and question
                guessNumber = random.nextInt(10)+1; 
                System.out.println("-------------------------------");
                System.out.println("-");
                System.out.println("Is the number " + guessNumber + " ?");
                counter++;

                if(guessNumber > theNumber) //Too high
                {
                    messageToComputer = guessNumber + " is too high. Please guess again...";
                    System.out.println("-");
                }
                else if (guessNumber < theNumber) //Too low
                {
                    messageToComputer = guessNumber + " is too low. Please guess again...";
                    System.out.println("-");
                }
                else //The number guessed by the computer is correct
                {
                    System.out.println("====================================================================================");
                    messageToComputer = guessNumber + " is the correct number!! Yay!" + " This took " + counter +" attempts." ;

                    guessControl = true;
                    control = true;
                }

                //Prints the message to the computer
                System.out.println(messageToComputer);

            }while (guessControl == false); //End of guess loop
            
            System.err.println(" ");
            System.out.println("According to Mr. Kinser's grading criteia you recived the following... " );
                    
            //Grading switch
            int numberOfTries = counter;
            switch(numberOfTries) {
                case 1:
                    System.out.println("The computer took one try resulting in an A for meeting and consistently exceeding expectations. Wowie! Fantastic!");
                    break;
                case 2:
                    System.out.println("The computer took two tries resulting in a B for meeting and sometimes exceeding expectations. Pretty good!");
                    break;

                case 3:
                    System.out.println("The computer took three tries resulting in a C for meeting expectations. Not bad but you can do better!");
                    break;

                case 4:
                    System.out.println("The computer took four tries resulting in a D for sometimes fails to meet expectations. It's ok but plan to do better and try harder!");
                    break;

                default:
                    System.out.println("The computer took more than five tries resulting in an F for consistently fails to meet expectations is an F. Maybe consider seeing what areas you could improve on to meet some expectaions.");

            }//End of switch
        }while (control == false);  //End of loop
    }
}