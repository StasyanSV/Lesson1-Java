package org.example.lesson1.cw1;

import java.util.Scanner;

/*
Дан массив nums. Мы определяем текущую сумму массива как  runningSum[i] = sum(nums[0]…nums[i]).
Вернуть текущую сумму nums.
 */
public class Zdn6 {
    public static void main(String[] args) {
        System.out.println(runningSum());
    }

    public static int[] runningSum() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int [] resArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resArray[i] = arr[i] + resArray[i-1];
        }
        for (int i = 0; i < resArray.length; i++) {
            System.out.println(resArray[i]);
        }

        return  null;
    }
}
