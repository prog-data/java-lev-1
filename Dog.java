package ru.geekbrains.eon.j1.dz5;

import java.util.Random;

public class Dog extends Animal {
    private static final Random RANDOM = new Random();

    public Dog(String name) {
        super(name, (450 + RANDOM.nextFloat()*100), (0.4f + RANDOM.nextFloat()* 0.2f), (9 + RANDOM.nextFloat()*2));
    }
}
