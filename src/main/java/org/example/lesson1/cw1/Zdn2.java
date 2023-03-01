package org.example.lesson1.cw1;

//Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;

public class Zdn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int num1 = scan.nextInt();
        int count = 0;
        for (int i = 1; i < N; i++) {
            int num2 = scan.nextInt();
            if (num1 > 0 && num2 < 0 ){
                count++;
            }
            num1 = num2;
        }
        System.out.println(count);
    }
}
