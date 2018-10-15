package ru.geekbrains.eon.j1.dz5;

import java.util.Random;

public class Cat extends Animal {
    private static final Random RANDOM = new Random();

    public Cat(String name) {
        super(name, (180 + RANDOM.nextFloat()*40), (1.8f + RANDOM.nextFloat()* 0.4f), 0);
    }

}
