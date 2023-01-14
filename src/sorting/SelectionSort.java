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
public class SelectionSort {

    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Selection Sort:");
        array = creatingArray(array);
        System.out.print("Before: ");
        print(array);
        array = selectionSort(array);
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

    public static int[] selectionSort(int array[]) {
        int n = array.length;
        int aux, min;

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int k = i + 1; k < n; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }

                if (min != i) {
                    aux = array[i];
                    array[i] = array[min];
                    array[min] = aux;
                }
            }
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
