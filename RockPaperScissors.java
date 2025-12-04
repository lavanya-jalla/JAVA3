import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to the 5-round Input Game of ROCK PAPER SCISSORS!  (0=Rock, 1=Paper, 2=Scissors)");
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;
        int rounds = 5;
        int tie=0;
        for(int i=1;i<=rounds;i++){
            System.out.println("\n ------Let's Ready for Round " + i + " -----");
            int randomInt = random.nextInt(3);
             System.out.println("Computer Choice: " + randomInt);
              System.out.println("User Choice: ");
              int userchoice=sc.nextInt(3);
        
        if(randomInt==0 && userchoice==1 || randomInt==2 && userchoice==0 || randomInt==1 && userchoice==2){
            System.out.println("User Win");
            userWins++;
        }
        else if(randomInt==1 && userchoice==0 || randomInt==0 && userchoice==2 || randomInt==2 && userchoice==1){
            System.out.println("Computer Win");
            computerWins++;

        }
          
         else if(randomInt==1 && userchoice==1 || randomInt==2 && userchoice==2 || randomInt==0 && userchoice==0  ){
            System.out.println("Tiee");
            tie++;

        }   
        else{

            System.out.println("InValid Choice");
        }     

        }
        System.out.println("GAME IS OVER...THE RESULTS ARE.....");

    if(computerWins>userWins){
        System.out.println("Computer Winnerr!!!!!!!!!!!");
    }
    else if(tie==5){
        System.out.println("Tiee...Let's Play one more Time");
    }
    else{
        System.out.println("User Winner!!!!!!!!!!!!!!!!!!!");
    }

    }
}
    

