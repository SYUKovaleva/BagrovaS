package com.max.idea;
public class Massive {
    public static void main(String[] args) {
        //Задание 3.1
        int[] cars = {11, 22, 36, 44, 55};
        //Задание 3.2
        int first = cars[0];
        int last = cars[cars.length - 1];
        cars[0] = last;
        cars[cars.length - 1] = first;
        System.out.println("Первый элемент: " + cars[0] + "; Последний элемент: " + cars[cars.length - 1]);
        //Задание 3.3
        System.out.println("Сумма первого и среднего: " + (cars[0] + cars[cars.length/2]));
    }
}