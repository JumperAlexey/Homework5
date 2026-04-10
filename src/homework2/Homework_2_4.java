package homework2;

import java.util.Scanner;

public class Homework_2_4 {

/*
Задача 4:
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */

    public static void main(String[] args) {
        int i = 7;
        int k = 1;
        int res = 1;
        while (k < 15) {
            res = i * k;
            k++;
            System.out.println(res);
        }
    }
}
