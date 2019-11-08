package com.sparta.sb.rabbitExplosion.animals;

import java.util.Random;

public abstract class Animal
{
    private int name;
    private int age;
    private int gender; // 1 for female & 0 for male

    public Animal(int name)
    {
        this.name = name;
        this.age = 0;
        decideGender();
    }

    public Animal(int name, int gender)
    {
        this.name = name;
        this.age = 0;
        this.gender = gender;
    }

    private void decideGender()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(2) + 1;

        if(randomNum == 1)
        {
            gender = 1;
        }
        else
        {
            gender = 0;
        }
    }

    public void incrementAge()
    {
        this.age++;
    }

    public int getAge()
    {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public abstract int makeBabies();

    public abstract boolean canBreed();
}
