package com.sparta.sb.rabbitExplosion.animals;

import java.util.Random;

public class Rabbit extends Animal
{
    public Rabbit(int name, int gender)
    {
        super(name,gender);
    }

    public Rabbit(int name)
    {
        super(name);
    }

    @Override
    public int makeBabies()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(14) + 1;

        return randomNum;
    }

    @Override
    public boolean canBreed()
    {
        if(this.getAge() >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
