/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */


package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(a));
        System.out.println();
        int length = 0;
        for (int element : a) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}



