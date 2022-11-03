package Interspedia;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Lets start the game ");
        
        randomenumber();
    }
    public static void randomenumber(){
        final int NUMBEROFTRIALS = 7;

        Scanner in = new Scanner(System.in);

        int i = NUMBEROFTRIALS;

        System.out.println("Guess the random number between 1 and 100");
        int data;
        int randomenumber = (int)(100*Math.random()+1);

        while(i>0){
            System.out.print("Guess the number: ");
            data = in.nextInt();
            if(data == randomenumber){
                System.out.println("Congratulations🎉🎉🎉 Your guess is correct ");
                return;
            }else if(data > randomenumber){
                System.out.println("Guessed number is greater");
            }else{
                System.out.println("Gussed number is smaller");
            }
            i--;
        }

        System.out.println("Sorry you lose the game since number of chances exhausted");
    }
}
