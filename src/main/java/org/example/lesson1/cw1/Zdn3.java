package org.example.lesson1.cw1;

//Дана строка. Поменять местами ее половины.

import java.util.Scanner;

public class Zdn3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str = scan.nextLine();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr
                .append(str.substring(str.length() / 2, str.length()))
                .append(str.substring(0,str.length() / 2));
        System.out.println(myNewStr.toString());

    }
}
