import java.util.Random;
import java.util.Scanner;

public class Game {
    int guess;
    int randomNumber;
    int attempts;
    private Scanner sc;
    
    
    public Game() {
        
        System.out.println("Welcome to Guess the Number Game");
           Random random=new Random();
            randomNumber = random.nextInt(100) + 1; 
           sc=new Scanner(System.in);
           attempts=0;
           System.out.print("Enter your guess: ");
           guess=sc.nextInt();

    }
    public void isCorrect(){
          while (guess != randomNumber) {
            attempts++;
        if(guess>randomNumber){
            System.out.println("Your Input is greater....Try Again");
            

        }
        else if(guess<randomNumber){
            System.out.println("Your Input is Lesser.....Try Again");
            
        }
        
            
        System.out.print("Enter your guess: ");
           guess = sc.nextInt();
           
        }
        attempts++;
        System.out.println("We are match...You Guessed Right after  " +attempts+ "Attempts");
    
    
    sc.close();
    }

    public static void main(String[] args) {
        Game g=new Game();
        g.isCorrect();
    }
    
    
        
    
    
}
