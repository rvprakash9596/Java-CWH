package OOPs;

import java.util.Scanner;

public class Exerxise3_43 {
    public static void main(String[] args) {
        /*
        Create a class Game , which allows a user to play "Guess the number " game once.
        Game should have the following methods :
        1. Constructor to generate the random number.
        2. takeUserInput to take a user input of number.
        3. isCorrectNumber() to detect whether the number entered by the user is true or not?
        4. Use properties such as noOfGuesses(int) etc to get this task done;
         getter and setter for noOfGuesses
         */

        Scanner sc=new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNumber=0;

        do{
            System.out.print("Guess Any Number Between 1-100 :");
            userNumber=sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Wow! Correct answer ");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }
        }
        while (userNumber>=0);
        System.out.println("My number was :");
        System.out.println(myNumber);

    }
}
