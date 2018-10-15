package ru.geekbrains.eon.j1.dz5;

import java.util.Random;

public class Horse extends Animal  {
    private static final Random RANDOM = new Random();

    public Horse(String name) {
        super(name, (1350 + RANDOM.nextFloat()*300), (2.7f + RANDOM.nextFloat()* 0.6f), (90 + RANDOM.nextFloat()*20));
    }
}
