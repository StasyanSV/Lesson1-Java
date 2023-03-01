package org.example.lesson1.cw1;

//Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.

import java.util.Scanner;

public class Zdn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        int pr = 1;

        while (n!=0){
            pr *= n%10;
            sum += n%10;
            n /= 10;
        }
        System.out.println(pr-sum);
    }
}
