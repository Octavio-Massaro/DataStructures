/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import java.util.Random;

/**
 *
 * @author Octavio Massaro
 */

/*          
            SHELL SORT:

    Complexity:
        Best Case: ?
        Average Case: ?
        Worst Case: ?
*/

public class ShellSort {

    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Shell Sort:");
        array = creatingArray(array);
        System.out.print("Before: ");
        print(array);
        array = shellSort(array);
        System.out.print("After: ");
        print(array);
    }

    public static int[] creatingArray(int array[]) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
        }

        return array;
    }

    public static int[] shellSort(int array[]) {
        int n = array.length;
        int h = 1;
        int i, j, aux;

        while (h < n / 2) {
            h = 2 * h;
        }

        while (h >= 1) {
            for (i = h; i < n; i++) {
                j = i;

                while (j >= h && array[j] < array[j - h]) {

                    aux = array[j];
                    array[j] = array[j - h];
                    array[j - h] = aux;

                    j = j - h;
                }
            }
            h = h / 2;
        }

        return array;
    }

    public static void print(int array[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
