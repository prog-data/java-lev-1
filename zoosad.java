package ru.geekbrains.eon.j1.dz5;

public class zoosad {
    public static void main(String[] args) {
        Cat c1 = new Cat("Барсик");
        c1.run(200);
        c1.jump(2);
        c1.swim(1);

        Dog d1 = new Dog("Шарик");
        d1.run(500);
        d1.jump(0.5f);
        d1.swim(10);

        Horse h1 = new Horse("Буцефал");
        h1.run(1500);
        h1.jump(3f);
        h1.swim(100);

        Bird b1 = new Bird("Чижик");
        b1.run(5);
        b1.jump(0.2f);
        b1.swim(1);

    }
}
