/*
Exercise-3 GUESS THE NUMBER
Create a class Game, which allows a user to play "Guess the number" game once
Game should have the following methods
1. Constructor to generate the random number
2. take UserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getters and setters for no of guesses
  Use prperties such as noOfGuesses(int),etc to get this task done
*/


import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
    void takeUserInput(){
        System.out.println("Guess the number");
        @SuppressWarnings("resource") // for sc not close in this 
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        // sc.close();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class TUT_43{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
