package com.sparta.sb.rabbitExplosion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.sb.rabbitExplosion.animals.Animal;
import com.sparta.sb.rabbitExplosion.animals.Rabbit;
import com.sparta.sb.rabbitExplosion.model.Farm;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Farm farm = new Farm();
    private Animal rabbit;
    private Animal fox;
    private List<Animal> listOfRabbits = new ArrayList<>();


    @Test
    public void testMakingChildren()
    {
        farm.makeChildren(5);
        assertEquals(5, farm.getListOfRabbits().size());
    }

    @Test
    public void testAdamAndEve()
    {
        farm.startPopulation();
        assertEquals(2,farm.getListOfFoxes().size());
    }

    @Test
    public void testForIncrementingAgeOfSingleRabbit()
    {
        rabbit = new Rabbit(1);
        rabbit.incrementAge();
        assertEquals(1,rabbit.getAge());
    }

    @Test
    public void testForCreatingListOfRabbits()
    {
        Animal tempRabbit;
        int name = 0;

        for (int i = 0; i < 10; i++) {
            tempRabbit = new Rabbit(i);
            listOfRabbits.add(tempRabbit);
        }

        assertEquals(10,listOfRabbits.size());
    }

    @Test
    public void testForIncrementingAgeInList()
    {
        Animal tempRabbit;
        int name = 0;

        for(int i=0; i<10; i++)
        {
            tempRabbit = new Rabbit(i);
            listOfRabbits.add(tempRabbit);
        }

        for (Animal rabbit:listOfRabbits)
        {
            rabbit.incrementAge();
        }

        assertEquals(1, listOfRabbits.get(4).getAge());
    }
}
