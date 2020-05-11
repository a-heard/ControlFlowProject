import java.util.*;


public class Main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:  ");
        String name = scan.next();
        System.out.println("Hello " + name
                + " do you wish to continue to the interactive portion? \nEnter 'yes' or 'y', continue:");
                                                                                                          
        String response = scan.next();

        switch (response) {
            case "yes":
            case "y":
                break;

            default:
                System.out.println("Thanks for stoping by! Ya'll be good now ya hear!!");
                System.exit(0);

        }

        String playAgain;
        do {
            
            System.out.println("What is the name of your favorite pet? :  ");
            String pet = scan.next();
            System.out.println("what is the age of your favorite pet.");
            int petAge = scan.nextInt();
            System.out.println("What is your lucky number?");
            int lucky = scan.nextInt();
            System.out.println("Do you have a favorite quarterback?");
            String jersey = scan.next();

            int jerseyNum;
            switch (jersey) {
                case "yes":
                case "y":
                    System.out.println("What is their jersey number?");
                    jerseyNum = scan.nextInt(); 
                    break;
                case "no":
                    break;
                default:
                    break;
            }
            System.out.println("What is the two-digit model year of your car?  ");
            int modelYear = scan.nextInt();
            System.out.println("What is the first name of the your favorite actor or actress?  ");
            String actor = scan.next();
            System.out.println("Enter a random number between 1 and 50:  ");
            int userRandomNum = scan.nextInt();

            Random rand = new Random();
            int  max= 75; 
            int int_random = rand.nextInt(max);
            int int_random1 = rand.nextInt(max);
            int int_random2 = rand.nextInt(max);

            int magicBall = (int_random * lucky);
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            } 
            System.out.println(magicBall);

            int favPetNum = pet.charAt(2);
            while (favPetNum > 65) {
                favPetNum = favPetNum - 65;
            } 
            int value = 42;
            int random = userRandomNum - int_random1;
                                                     
            if (random < 1) {
                random = random + 64;
            }
            int carNum = lucky + modelYear;
            int lastnum = petAge + modelYear;
            System.out.println("Lottery Numbers: " + favPetNum + ", " + value + ", " + random + ", "
                    + carNum + ", " + lastnum + ", " + "Magic Ball: "+ magicBall);
            System.out.println("Would you like to play again? :  ");
            playAgain = scan.next();

        } while (playAgain.equals("yes") || playAgain.equals("y"));
        System.out.print("See you next time!");
        System.exit(0);

    }

}
    
