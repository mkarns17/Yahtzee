/**
 * Created by mkarns17 on 12/13/15.
 */
import java.util.Scanner;

public class YahtzeeGame
{
    public static final int NUM_SIDES = 6;
    private YahtzeeDie dice1 = new YahtzeeDie(NUM_SIDES);
    private YahtzeeDie dice2 = new YahtzeeDie(NUM_SIDES);
    private YahtzeeDie dice3 = new YahtzeeDie(NUM_SIDES);
    private YahtzeeDie dice4 = new YahtzeeDie(NUM_SIDES);
    private YahtzeeDie dice5 = new YahtzeeDie(NUM_SIDES);
    private YahtzeeScorecard scorecard = new YahtzeeScorecard();

    /* initializes the dice and scoreboard */
    public YahtzeeGame()
    {
    }

    /* check to see if the game is over, and while the game is not over call the method takeTurn()
    once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
    final scorecard and return the grand total */
    public int playGame()
    {
        for(int turns = 0; turns < 13; turns++) {
            this.takeTurn();
        }
        this.scorecard.printScoreCard();
        return this.scorecard.getGrandTotal();
    }

    /* 	1. call rollDice()
        2. call printDice()
        3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
           If they are not satisfied continue, otherwise call markScore()
        4. call chooseFrozen()
        5. call rollDice()
        6. call printDice()
        7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
           If they are not satisfied continue, otherwise call markScore()
        8. call chooseFrozen()
        9. call rollDice()
        10. call printDice()
        11. call markScore()
    */

    private void takeTurn()
    {
        int i = 0;
        String answer;
        Scanner s = new Scanner(System.in);
        boolean b = true;
        while (b == true) {
            rollDice();
            printDice();
            if (i == 2) {
                b = false;
                markScore();
            }
            if (i < 2) {
                System.out.println("Are you (s)atisfied or to you want to freeze dice and (r)oll again? (s/r):");
                answer = new String(s.nextLine());
                if (answer.indexOf("r") >= 0) {
                    chooseFrozen();
                } else {
                    b = false;
                    markScore();
                }
                i++;
            }
        }
    }


    /* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
    private void rollDice()
    {
        if(this.dice1.isFrozen() == false) {
            this.dice1.rollDie();
        } else {
            this.dice1.unfreezeDie();
        }

        if(this.dice2.isFrozen() == false) {
            this.dice2.rollDie();
        } else {
            this.dice2.unfreezeDie();
        }

        if(this.dice3.isFrozen()== false) {
            this.dice3.rollDie();
        } else {
            this.dice3.unfreezeDie();
        }

        if(this.dice4.isFrozen()== false) {
            this.dice4.rollDie();
        } else {
            this.dice4.unfreezeDie();
        }

        if(this.dice5.isFrozen()== false) {
            this.dice5.rollDie();
        } else {
            this.dice5.unfreezeDie();
        }
    }

    /* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
    private void chooseFrozen()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Which dice do you want frozen? (1-5): ");
        String whichDice = s.nextLine();
        if(whichDice.indexOf("1") >= 0) {
            this.dice1.freezeDie();
        }

        if(whichDice.indexOf("2") >= 0) {
            this.dice2.freezeDie();
        }

        if(whichDice.indexOf("3") >= 0) {
            this.dice3.freezeDie();
        }

        if(whichDice.indexOf("4") >= 0) {
            this.dice4.freezeDie();
        }

        if(whichDice.indexOf("5") >= 0) {
            this.dice5.freezeDie();
        }

    }

    /* Should print the value of all five dice separated by a tab (\t) to the console */
    private void printDice()
    {
        System.out.print(this.dice1.getValue() + "\t");
        System.out.print(this.dice2.getValue() + "\t");
        System.out.print(this.dice3.getValue() + "\t");
        System.out.print(this.dice4.getValue() + "\t");
        System.out.println(this.dice5.getValue() + "\t");
    }

    /* 1. Print a scoreboard
       2. Ask the user where they would like to mark their score.
       3. Call appropriate function
       4. If false is returned the user entered an invalid number, so ask the user to try again	*/
    private void markScore() {
        Scanner s = new Scanner(System.in); //var1
        int placement;  //var2
        boolean validNum;
        do {
            this.scorecard.printScoreCard();

            System.out.println("Where would you like to mark your score? (1-13): ");
            placement = s.nextInt();
            s.nextLine();
        } while (placement > 13 || placement < 0);

        switch (placement) {
            case 1:
                validNum = this.scorecard.markOnes(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 2:
                validNum = this.scorecard.markTwos(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 3:
                validNum = this.scorecard.markThrees(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 4:
                validNum = this.scorecard.markFours(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 5:
                validNum = this.scorecard.markFives(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 6:
                validNum = this.scorecard.markSixes(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 7:
                validNum = this.scorecard.markThreeOfAKind(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 8:
                validNum = this.scorecard.markFourOfAKind(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 9:
                validNum = this.scorecard.markFullHouse(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 10:
                validNum = this.scorecard.markSmallStraight(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 11:
                validNum = this.scorecard.markLargeStraight(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 12:
                validNum = this.scorecard.markYahtzee(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());
                break;
            case 13:
                validNum = this.scorecard.markChance(this.dice1.getValue(), this.dice2.getValue(), this.dice3.getValue(), this.dice4.getValue(), this.dice5.getValue());

                while (!validNum) {
                    System.out.println("Please try again. ");
                }

        }
    }
}
