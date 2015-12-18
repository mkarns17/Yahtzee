/**
 * Created by mkarns17 on 12/17/15.
 */
public class YahtzeeScorecard {
    private int ones = -1;
    private int twos = -1;
    private int threes = -1;
    private int fours = -1;
    private int fives = -1;
    private int sixes = -1;
    private int threeKind = -1;
    private int fourKind = -1;
    private int fiveKind = -1;
    private int chance = -1;
    private int fullHouse = -1;
    private int smStraight = -1;
    private int lgStraight = -1;
    private boolean bonus = false;

    public YahtzeeScorecard() {
    }

    public boolean markOnes(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.ones != -1) {
            return false;
        } else {
            if(die1 == 1) {
                ++num1;
            }

            if(die2 == 1) {
                ++num1;
            }

            if(die3 == 1) {
                ++num1;
            }

            if(die4 == 1) {
                ++num1;
            }

            if(die5 == 1) {
                ++num1;
            }

            this.ones = num1;
            this.updateBonus();
            return true;
        }
    }

    public boolean markTwos(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.twos != -1) {
            return false;
        } else {
            if(die1 == 2) {
                ++num1;
            }

            if(die2 == 2) {
                ++num1;
            }

            if(die3 == 2) {
                ++num1;
            }

            if(die4 == 2) {
                ++num1;
            }

            if(die5 == 2) {
                ++num1;
            }

            this.twos = num1 * 2;
            this.updateBonus();
            return true;
        }
    }

    public boolean markThrees(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.threes != -1) {
            return false;
        } else {
            if(die1 == 3) {
                ++num1;
            }

            if(die2 == 3) {
                ++num1;
            }

            if(die3 == 3) {
                ++num1;
            }

            if(die4 == 3) {
                ++num1;
            }

            if(die5 == 3) {
                ++num1;
            }

            this.threes = num1 * 3;
            this.updateBonus();
            return true;
        }
    }

    public boolean markFours(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.fours != -1) {
            return false;
        } else {
            if(die1 == 4) {
                ++num1;
            }

            if(die2 == 4) {
                ++num1;
            }

            if(die3 == 4) {
                ++num1;
            }

            if(die4 == 4) {
                ++num1;
            }

            if(die5 == 4) {
                ++num1;
            }

            this.fours = num1 * 4;
            this.updateBonus();
            return true;
        }
    }

    public boolean markFives(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.fives != -1) {
            return false;
        } else {
            if(die1 == 5) {
                ++num1;
            }

            if(die2 == 5) {
                ++num1;
            }

            if(die3 == 5) {
                ++num1;
            }

            if(die4 == 5) {
                ++num1;
            }

            if(die5 == 5) {
                ++num1;
            }

            this.fives = num1 * 5;
            this.updateBonus();
            return true;
        }
    }

    public boolean markSixes(int die1, int die2, int die3, int die4, int die5) {
        int num1 = 0;
        if(this.sixes != -1) {
            return false;
        } else {
            if(die1 == 6) {
                ++num1;
            }

            if(die2 == 6) {
                ++num1;
            }

            if(die3 == 6) {
                ++num1;
            }

            if(die4 == 6) {
                ++num1;
            }

            if(die5 == 6) {
                ++num1;
            }

            this.sixes = num1 * 6;
            this.updateBonus();
            return true;
        }
    }

    public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5) {
        if(this.threeKind != -1) {
            return false;
        } else {
            YahtzeeSortDice var6 = new YahtzeeSortDice(die1, die2, die3, die4, die5);
            if((var6.getFirst() != var6.getSecond() || var6.getSecond() != var6.getThird()) && (var6.getSecond() != var6.getThird() || var6.getThird() != var6.getFourth()) && (var6.getThird() != var6.getFourth() || var6.getFourth() != var6.getFifth())) {
                this.threeKind = 0;
            } else {
                this.threeKind = die1 + die2 + die3 + die4 + die5;
            }

            return true;
        }
    }

    public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5) {
        if(this.fourKind != -1) {
            return false;
        } else {
            YahtzeeSortDice num1 = new YahtzeeSortDice(die1, die2, die3, die4, die5);
            if((num1.getFirst() != num1.getSecond() || num1.getSecond() != num1.getThird() || num1.getThird() != num1.getFourth()) && (num1.getSecond() != num1.getThird() || num1.getThird() != num1.getFourth() || num1.getFourth() != num1.getFifth())) {
                this.fourKind = 0;
            } else {
                this.fourKind = die1 + die2 + die3 + die4 + die5;
            }

            return true;
        }
    }

    public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5) {
        if(this.fullHouse != -1) {
            return false;
        } else {
            YahtzeeSortDice num1 = new YahtzeeSortDice(die1, die2, die3, die4, die5);
            if((num1.getFirst() != num1.getSecond() || num1.getSecond() != num1.getThird() || num1.getFourth() != num1.getFifth()) && (num1.getThird() != num1.getFourth() || num1.getFourth() != num1.getFifth() || num1.getFirst() != num1.getSecond())) {
                this.fullHouse = 0;
            } else {
                this.fullHouse = 25;
            }

            return true;
        }
    }

    public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5) {
        if(this.smStraight != -1) {
            return false;
        } else {
            this.smStraight = 0;
            YahtzeeSortDice num1 = new YahtzeeSortDice(die1, die2, die3, die4, die5);
            if(num1.getFirst() + 1 == num1.getSecond()) {
                if(num1.getSecond() + 1 == num1.getThird()) {
                    if(num1.getThird() + 1 == num1.getFourth()) {
                        this.smStraight = 30;
                    } else if(num1.getThird() + 1 == num1.getFifth()) {
                        this.smStraight = 30;
                    }
                } else if(num1.getSecond() + 1 == num1.getFourth() && num1.getFourth() + 1 == num1.getFifth()) {
                    this.smStraight = 30;
                }
            } else if(num1.getSecond() + 1 == num1.getThird() && num1.getThird() + 1 == num1.getFourth() && num1.getFourth() + 1 == num1.getFifth()) {
                this.smStraight = 30;
            }

            return true;
        }
    }

    public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5) {
        if(this.lgStraight != -1) {
            return false;
        } else {
            YahtzeeSortDice num1 = new YahtzeeSortDice(die1, die2, die3, die4, die5);
            if(num1.getFirst() + 1 == num1.getSecond() && num1.getSecond() + 1 == num1.getThird() && num1.getThird() + 1 == num1.getFourth() && num1.getFourth() + 1 == num1.getFifth()) {
                this.lgStraight = 40;
            } else {
                this.lgStraight = 0;
            }

            return true;
        }
    }

    public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5) {
        if(this.fiveKind != -1) {
            return false;
        } else {
            if(die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5) {
                this.fiveKind = 50;
            } else {
                this.fiveKind = 0;
            }

            return true;
        }
    }

    public boolean markChance(int die1, int die2, int die3, int die4, int die5) {
        if(this.chance != -1) {
            return false;
        } else {
            this.chance = die1 + die2 + die3 + die4 + die5;
            return true;
        }
    }

    private void updateBonus() {
        if(!this.bonus && this.getUpperTotal() >= 63) {
            this.bonus = true;
        }

    }

    public int getUpperTotal() {
        int total = 0;
        if(this.ones != -1) {
            total += this.ones;
        }

        if(this.twos != -1) {
            total += this.twos;
        }

        if(this.threes != -1) {
            total += this.threes;
        }

        if(this.fours != -1) {
            total += this.fours;
        }

        if(this.fives != -1) {
            total += this.fives;
        }

        if(this.sixes != -1) {
            total += this.sixes;
        }

        if(this.bonus) {
            total += 35;
        }

        return total;
    }

    public int getLowerTotal() {
        int i = 0;

        if(this.threeKind != -1) {
            i += this.threeKind;
        }

        if(this.fourKind != -1) {
            i += this.fourKind;
        }

        if(this.fullHouse != -1) {
            i += this.fullHouse;
        }

        if(this.fiveKind != -1) {
            i += this.fiveKind;
        }

        if(this.smStraight != -1) {
            i += this.smStraight;
        }

        if(this.lgStraight != -1) {
            i += this.lgStraight;
        }

        if(this.chance != -1) {
            i += this.chance;
        }

        return i;
    }

    public int getGrandTotal() {
        int i = 0;
        if (ones != -1) {
            i += ones;
        }
        if (twos != -1) {
            i += twos;
        }
        if (threes != -1) {
            i += threes;
        }
        if (fours != -1) {
            i += fours;
        }
        if (fives != -1) {
            i += fives;
        }
        if (sixes != -1) {
            i += sixes;
        }
        if(this.threeKind != -1) {
            i += this.threeKind;
        }

        if(this.fourKind != -1) {
            i += this.fourKind;
        }

        if(this.fullHouse != -1) {
            i += this.fullHouse;
        }

        if(this.fiveKind != -1) {
            i += this.fiveKind;
        }

        if(this.smStraight != -1) {
            i += this.smStraight;
        }

        if(this.lgStraight != -1) {
            i += this.lgStraight;
        }

        if(this.chance != -1) {
            i += this.chance;
        }

        return i;

//        return this.getUpperTotal() + this.getLowerTotal();
    }

    public void printScoreCard() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*      Yahtzee Score Card       *");
        System.out.println("*                               *");
        System.out.print("*  Ones:\t\t");
        if(this.ones == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.ones);
        }

        System.out.println("\t*");
        System.out.print("*  Twos:\t\t");
        if(this.twos == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.twos);
        }

        System.out.println("\t*");
        System.out.print("*  Threes:\t\t");
        if(this.threes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threes);
        }

        System.out.println("\t*");
        System.out.print("*  Fours:\t\t");
        if(this.fours == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fours);
        }

        System.out.println("\t*");
        System.out.print("*  Fives:\t\t");
        if(this.fives == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fives);
        }

        System.out.println("\t*");
        System.out.print("*  Sixes:\t\t");
        if(this.sixes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.sixes);
        }

        System.out.println("\t*");
        System.out.println("*\t\t\t\t*");
        System.out.print("*  Upper Bonus:\t\t");
        if(this.bonus) {
            System.out.print("35");
        } else {
            System.out.print("0");
        }

        System.out.println("\t*");
        System.out.print("*  Upper Total:\t\t");
        System.out.print(this.getUpperTotal());
        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  3 of Kind:\t\t");
        if(this.threeKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threeKind);
        }

        System.out.println("\t*");
        System.out.print("*  4 of Kind:\t\t");
        if(this.fourKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fourKind);
        }

        System.out.println("\t*");
        System.out.print("*  Full House:\t\t");
        if(this.fullHouse == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fullHouse);
        }

        System.out.println("\t*");
        System.out.print("*  Sm Straight:\t\t");
        if(this.smStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.smStraight);
        }

        System.out.println("\t*");
        System.out.print("*  Lg Straight:\t\t");
        if(this.lgStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.lgStraight);
        }

        System.out.println("\t*");
        System.out.print("*  Yahtzee:\t\t");
        if(this.fiveKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fiveKind);
        }

        System.out.println("\t*");
        System.out.print("*  Chance:\t\t");
        if(this.chance == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.chance);
        }

        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  Lower Total:\t\t");
        System.out.print(this.getLowerTotal());
        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  Grand Total:\t\t");
        System.out.print(this.getGrandTotal());
        System.out.println("\t*");
        System.out.println("**********************************");
        System.out.println();
    }
}

