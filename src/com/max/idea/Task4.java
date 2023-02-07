package com.max.idea;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nОтгадай загадку: 'Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает'\nМожешь взять подсказку, но тогда придётся угадать с первого раза!\nПопытка 1.");
        String answer;
        int attempt = 1;

        while (attempt < 4) {
            System.out.println("Твой ответ:");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;

            } else if (answer.equalsIgnoreCase("Подсказка") && attempt == 1) {
                System.out.println("Подсказка: Это точно не ЛУК!");
                System.out.println("\nПопытка " + attempt + ".");
                System.out.println("Твой ответ:");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                } else {
                    System.out.println("Обидно, приходи в другой раз.");
                    break;
                }

            } else if (answer.equalsIgnoreCase("Подсказка") && attempt > 1) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("\nПопытка " + attempt + ".");

            } else if (attempt < 3) {
                System.out.println("Подумай еще! \nПопытка " + (attempt + 1) + ".");
                attempt++;
            } else if (attempt == 3) {
                System.out.println("Обидно, приходи в другой раз.");
                break;
            }
        }
    }
}

