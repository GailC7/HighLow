import java.util.Random;

public class HighLow {
    public static void main(String[] args)
    {
        Random random = new Random();

       //Variables
        int counter = 0;
        boolean found = false;
        boolean guessControl= false;

        int min = 1; // Starting minimum
        int max = 10; // Starting maximum

        do{
     
            int theNumber = random.nextInt(10) + 1; 
            int guessNumber = random.nextInt(10) + 1;
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

             // Array to track guessed numbers
             boolean[] guessedNumbers = new boolean[11]; // Index 0 will not be used

            do
            {
                //Random number guesser and question
                System.out.println("-");
                

                // Generate a new guess until it finds a valid one
                while (true) {
                    guessNumber = random.nextInt(max - min + 1 ) + min; //sets a range to narrow it down

                    // Check if the number has already been guessed
                    if (!guessedNumbers[guessNumber]) {
                        guessedNumbers[guessNumber] = true; // Marks the number as guessed and exits the loop
                        break; // Valid guess is used
                    }
                }
                
                System.out.println("Is the number " + guessNumber + " ?");

                //Guess is too small
                if(guessNumber < theNumber)
                {
                    //Prints the message to the computer
                    System.out.println( guessNumber + " is too low. Please guess again...");
                    System.out.println("-");

                    //sets new min range for random generator
                    min = guessNumber + 1;
                    int range = max - min;

                    //Next Random number for computer to guess
                    guessNumber = random.nextInt(range)+ 1 + min ; 

                    System.out.println("--------------------------------------------------");
                }
                //Guess is too big
                else if(guessNumber > theNumber){

                    //Prints the message to the computer
                    System.out.println(guessNumber + " is too high. Please guess again...");
                    System.out.println("-");
                
                    //sets range for random generator
                    max = guessNumber - 1;
                    int range = max;

                    //Next guess lower number here
                    guessNumber = random.nextInt(range) + 1 ; //Plus one to take out the number 0

                    System.out.println("--------------------------------------------------");
                }

                else //The number guessed by the computer is correct
                {
                    System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
                    //Prints the message to the computer
                    System.out.println(guessNumber + " is the correct number!! Yay!" + " This took " + counter +" attempts.");

                    guessControl = true;
                    found = true;
                }

                System.out.println("-------------------------------");
                
                counter++;

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
                    System.out.println("The computer took more than five tries resulting in an F for consistently fails to meet expectations is an F.");
                    System.out.println("Maybe consider seeing what areas you could improve on to meet some expectaions.");

            }//End of switch

            System.out.println("═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
            System.err.println(" ");
        }while (found == false);  //End of loop
    }
}