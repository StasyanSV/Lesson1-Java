package org.example.lesson1.hw1;
/*
Учитывая входную строку s, измените порядок слов на противоположный .

Слово определяется как последовательность не пробельных символов. Слова в будут разделены хотя бы одним пробелом .s

Возвращает строку слов в обратном порядке, объединенных одним пробелом.

Обратите внимание , что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
 */
public class Zdn1 {
    public static void main(String[] args) {
        System.out.println(ChangeText("зимой время было такое позднее "));
    }

    public static String ChangeText(String a) {
        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
        }


        String[] myArray = new String[count+1];
        String res = "";
        int j = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                res += a.charAt(i);
            }
            else {
                myArray[j] = res;
                res = "";
                j++;
            }
        }

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        return "Did!";

    }
}

