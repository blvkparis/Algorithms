package com.company;

// Импорт библиотек

import java.util.Scanner;

public class FibonacciNums {

    // Подсчет числа Фибоначи
    public static void number() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            int Fn = f2 + f1;
            f1 = f2;
            f2 = Fn;
        }
        System.out.println(f2);
    }

    //Последняя цифра большого числа Фибоначчи
    public static void lastDigit() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            int Fn = (f2 + f1) % 10;
            f1 = f2;
            f2 = Fn;
        }
        System.out.println(f2);
    }
}