/**
 * Created by mkarns17 on 12/17/15.
 */
import java.util.*;

public class YahtzeeDie
{

    private Random r;
    private int numOfSides;
    private int value;
    private boolean isFrozen;

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public void setValue(int value) {
        this.value = 0;
    }

    public boolean setIsFrozen(boolean isFrozen) {
        if (this.isFrozen = isFrozen) {
            return true;
        }else return false;
    }





    public YahtzeeDie(int sides)
    {
        sides = 6;
    }

    public void rollDie()
    {
        r.nextInt(6);
    }

    /* Gets the current die value */
    public int getValue()
    {

        return -999;

    }


    public void freezeDie()
    {
        this.isFrozen = true;
    }


    public void unfreezeDie()
    {
        this.isFrozen = false;
    }


    public boolean isFrozen()
    {
        if (isFrozen = true){
            return true;
        } else return false;
    }



}