package org.example.lesson1.cw1;

//Дан массив целых чисел. Верно ли, что массив является симметричным.

public class Zdn5 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,6,3,2,1};
        System.out.println(tester(myArray));
    }

    public  static  String tester(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return  ("False");
            }
        }
        return  ("True");
    }

}
