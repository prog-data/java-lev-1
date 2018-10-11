package ru.geekbrains.eon.j1;

public class dom_z_004 {

        /* Задание 7. ** Написать методы (принимающие на вход массив сотрудников),
        вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль. */
        //Задание 7.1. Средний возраст
    public static void averageVozrast (Sotrudnik[] arraySot) {
        int kolvo = arraySot.length;
        float srednVoz = 0;
        for (int i = 0; i < kolvo; i++) {
            srednVoz = srednVoz + arraySot[i].getVozrast();
            //arraySot[i].printer();
        }
        srednVoz = srednVoz / kolvo ;
        System.out.println("Средний возраст сотрудников " + srednVoz);
    }
    //Задание 7.2. Средняя зарплата
    public static void averageZarplata (Sotrudnik[] arraySot) {
        int kolvo = arraySot.length;
        float srednZp = 0;
        for (int i = 0; i < kolvo; i++) {
            srednZp = srednZp + arraySot[i].getZarplata();
        }
        srednZp = srednZp / kolvo ;
        System.out.println("Средняя зарплдата сотрудников " + srednZp);
    }


    public static void main(String[] args) {
        //Создаем первого сотрудника
        Sotrudnik s1 = new Sotrudnik("Иванов А.Б.", 20000, 20);
        s1.printer();

        //Задание 4. Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
        System.out.println(s1.getFio() + "  " + s1.getVozrast());

        //Задание 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        //Задание 5.1. Создать массив из 5 сотрудников.
        Sotrudnik arrsot[] = new Sotrudnik [5];
        arrsot[0]= new Sotrudnik("Петров В.У.", 21000, 23);
        arrsot[1]= new Sotrudnik("Сидоров П.Л.", 22000, 33);
        arrsot[2]= new Sotrudnik("Кузнецова К.Д.", 23000, 43);
        arrsot[3]= new Sotrudnik("Васечкин А.Д.", 24000, 55);
        arrsot[4]= new Sotrudnik("Мишкин Е.С.", 25000, 28);

        //Задание 5.2. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i=0; i < arrsot.length; i++){
            if (arrsot[i].getVozrast()>40) {
                arrsot[i].printer();
            }
        }

        //Задание 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        for (int i=0; i < arrsot.length; i++){
            System.out.print("До    ");
            arrsot[i].printer();
            arrsot[i].st45plus5();
            System.out.print("После ");
            arrsot[i].printer();
        }
        /* Задание 7. ** Написать методы (принимающие на вход массив сотрудников),
        вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль. */
        //Вызов методов
        averageVozrast(arrsot);
        averageZarplata(arrsot);

    }

}
