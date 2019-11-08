package com.sparta.sb.rabbitExplosion.model;

import com.sparta.sb.rabbitExplosion.animals.Animal;
import com.sparta.sb.rabbitExplosion.animals.Rabbit;

import java.util.ArrayList;
import java.util.List;

public class Farm
{
    private List<Animal> listOfRabbits = new ArrayList<>();
    private List<Animal> listOfFoxes = new ArrayList<>();
    private Animal rabbit;
    private Animal fox;
    private int rabbitName;
    private int foxName;


    public void main()
    {
        int numOfBabies=0;
        startPopulation();

        while(listOfRabbits.size() < 1000)
        {
            numOfBabies = numberOfBabiesToBeCreated();

            if (numOfBabies > 0)
            {
                makeChildren(numOfBabies);
            }
        }
    }

    public void startPopulation()
    {
        for(rabbitName = 0; rabbitName < 2; rabbitName++)
        {
            listOfRabbits.add(new Rabbit(rabbitName,rabbitName +1));
            listOfFoxes.add(new Rabbit(foxName));
        }
    }

    public int numberOfBabiesToBeCreated()
    {
        int babiesFromMother=0;
        int matureMaleRabbit=0;

        for(int i = 0; i < listOfRabbits.size(); i++)
        {
            rabbit = listOfRabbits.get(i);

            if(rabbit.canBreed() && rabbit.getGender() == 1)
            {
                babiesFromMother+= rabbit.makeBabies();
            }
            else
            {
                if (rabbit.canBreed() && rabbit.getGender() == 0)
                {
                    matureMaleRabbit++;
                }
            }
            rabbit.incrementAge();
        }

        if (matureMaleRabbit == 0) return 0;
        else return babiesFromMother;
    }

    public void makeChildren(int numOfBabies)
    {
        for(int i = 0; i < numOfBabies; i++)
        {
            listOfRabbits.add(new Rabbit(rabbitName));
            rabbitName++;
        }
    }

    public List<Animal> getListOfRabbits() { return listOfRabbits; }

    public List<Animal> getListOfFoxes() { return listOfFoxes; }

    public Animal getRabbit() { return rabbit; }

    public Animal getFox() { return fox; }

    public int getRabbitName() { return rabbitName; }

    public int getFoxName() { return foxName; }
}