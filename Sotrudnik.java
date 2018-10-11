package ru.geekbrains.eon.j1;

//Задание 1. Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
public class Sotrudnik {
    private String fio;
    private float zarplata;
    private int vozrast;
    /*8. *** Продумать конструктор таким образом, чтобы при создании каждому
     сотруднику присваивался личный уникальный идентификационный порядковый номер*/
    private static int counter = 0;
    private int porNomVObekte;

//Задание 2. Конструктор класса должен заполнять эти поля при создании объекта;
    Sotrudnik(String fio, float zarplata, int vozrast){
        counter ++;
        this.fio = fio;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
        this.porNomVObekte = counter;
    }
//Вспомогательный метод для печати в консоль всех полей класса
    public void printer(){
        System.out.println(porNomVObekte + "  " +  fio + "  " + zarplata + "  " + vozrast);
    }

//Задание 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    String getFio(){
        return fio;
    }
    float getZarplata(){
        return zarplata;
    }
    int getVozrast(){
        return vozrast;
    }
//Задание 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    public void st45plus5(){
        if (vozrast > 45) {
            zarplata = zarplata + 5000f;
        }
    }
}
