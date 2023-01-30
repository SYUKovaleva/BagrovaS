package com.max.idea;

import java.util.Scanner;

public class Cycle8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое положительное число: ");
        int n = in.nextInt();

        if (n>0)
        {System.out.println("Сумма нечетных чисел равна: " + (((n+1)/2)*((n+1)/2)));}
        else
        {System.out.println("Мы же просили целое положительное! А Вы что ввели? :)");}

    }
}



