package com.max.idea;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара: ");
        double rate = input.nextDouble();

        System.out.println("Введите сумму в рублях: ");
        double rub = input.nextDouble();

        System.out.printf("Итого: %.2f долларов", (rub/rate));

    }
}
