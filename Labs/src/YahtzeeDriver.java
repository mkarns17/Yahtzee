/**
 * Created by mkarns17 on 12/17/15.
 */
import java.util.Scanner;

public class YahtzeeDriver
{

    public static void main(String [] args)
    {
        Scanner s= new Scanner(System.in);
        int numGames = 1;
        int maxScore = 0;
        int gameScore;
        int minScore = 0;
        int totalScore = 0;
        double avgScore;
        YahtzeeGame myGame=new YahtzeeGame();
        System.out.println("Welcome to Maddie's APCSA Yahtzee Game!");
        gameScore=myGame.playGame();
        minScore = gameScore;
        maxScore = gameScore;
        totalScore = gameScore;

        System.out.println("Would you like to play again? (y/n)");
        String playAgain = s.nextLine();
        if (playAgain.equals("y")){
            numGames++;
            gameScore = myGame.playGame();
            totalScore = totalScore + gameScore;
            if(gameScore > maxScore){
                maxScore = gameScore;
            }
            if (gameScore < minScore){
                minScore = gameScore;
            }
        } else if (playAgain.equals("n")){
            avgScore = totalScore / numGames;
            System.out.println(numGames + " , " + minScore + " , " + maxScore + " , " + avgScore);
        }
    }
}