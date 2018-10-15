package ru.geekbrains.eon.j1.dz5;

import java.util.Random;

public abstract class Animal {
    protected String name;
    protected float dRun;
    protected float dJump;
    protected float dSwim;


    public Animal(String name, float dRun, float dJump, float dSwim) {
        this.name = name;
        this.dRun = dRun;
        this.dJump = dJump;
        this.dSwim = dSwim;
   }

    void swim (float dSwim) {
        if (dSwim > this.dSwim) {
            System.out.println(this.nameKlassa()+ " " + name + " не может проплыть " +
                    dSwim + " метров. Задано = " +this.dSwim);
        }else{
            System.out.println(this.nameKlassa()+ " "+ name + " проплыл " + dSwim +
                    " метров. Задано = " + this.dSwim);
        }
    }

    void run(float dRun) {
        if (dRun > this.dRun) {
            System.out.println(this.nameKlassa()+ " " + name + " не может пробежать " +
                    dRun + " метров. Задано = " +this.dRun);
        }else{
            System.out.println(this.nameKlassa()+ " " + name + " пробежал " + dRun +
                    " метров. Задано = " + this.dRun);
        }
    }

    void jump(float dJump) {
        if (dJump > this.dJump) {
            System.out.println(this.nameKlassa()+ " "  + name + " не может прыгнуть на " + dJump +
                    " метров. Задано = " +this.dJump);
        }else{
            System.out.println(this.nameKlassa()+ " " + name + " прыгнул на " + dJump +
                    " метров. Задано = " +this.dJump);
        }
    }

    String nameKlassa (){
       if (this instanceof Cat){
           return "Кот";
       }
        if (this instanceof Dog){
            return "Собака";
        }
        if (this instanceof Bird){
            return "Птица";
        }
        if (this instanceof Horse){
            return "Лошадь";
        }

        return "Непонятка";
    }

}
