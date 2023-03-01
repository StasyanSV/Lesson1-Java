package org.example.lesson1.hw1;
/*
Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
 */
public class Zdn2 {
    public static void main(String[] args) {
        int[] myArray = {1,2,1,2,-1,1,3,1,3,-1,0};
        System.out.println(GenSum(myArray));
    }

    public static String GenSum(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0 && array[i+1] < 0 ){
                count += array[i];
            }
        }
        System.out.println(count);

        return "Did!";
    }
}
