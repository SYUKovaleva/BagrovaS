package com.max.idea;

public class Dannie12 {
    public static void main(String[] args) {
        String x = "I like Java!!!";

        // Проверить, содержит ли строка подстроку “Java” (используйте contains())
        boolean a = x.contains("Java");
        System.out.println("Содержит подстроку 'Java': " + a);

        // Проверить, начинается ли строка с подстроки “I like” (используйте startsWith())
        boolean b = x.startsWith("I like");
        System.out.println("Начинается с подстроки 'I like': " + b);

        // Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith())
        boolean d = x.endsWith("!!!");
        System.out.println("Заканчивается подстрокой '!!!': " + d);

        // Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (a == true & b == true & d == true) {
            System.out.println(x.toUpperCase());
        }
        else {
            System.out.println("Все условия не соблюдены");
        }

        // Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring())
        String result = x.replace('a', 'o');
        System.out.println(result.substring(7, 11));
    }
}