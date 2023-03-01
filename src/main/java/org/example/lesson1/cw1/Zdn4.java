package org.example.lesson1.cw1;

//Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки .

import java.util.Scanner;

public class Zdn4 {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        if(a.length() < b.length()) {
            return  addBinary(b,a);
        }

        String res ="";
        int count = 0;
        int j = b.length() - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if(a.charAt(i) == '1') {
                count++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                count++;
            }
            res = count % 2 + res;
            j--;
            count /= 2;
        }
        if (count >0) {
            res = count + res;
        }
        return res;
    }
}
