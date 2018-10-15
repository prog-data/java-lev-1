package ru.geekbrains.eon.j1.dz5;

import java.util.Random;

public class Bird extends Animal{
    private static final Random RANDOM = new Random();

    public Bird(String name) {
        super(name, (4.5f + RANDOM.nextFloat()*1), (0.18f + RANDOM.nextFloat()* 0.04f), 0);
    }
}
