package com.sparta.sb.rabbitExplosion.animals;

import java.util.Random;

public class Fox extends Animal
{
    public Fox(int name, char gender)
    {
        super(name);
    }

    @Override
    public int makeBabies()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;

        return randomNum;
    }

    @Override
    public boolean canBreed()
    {
        if(this.getAge() >=10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
