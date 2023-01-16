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
public class BubbleSort {

    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Bubble Sort:");
        array = creatingArray(array);
        System.out.print("Before: ");
        print(array);
        array = bubbleSort(array);
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

    public static int[] bubbleSort(int array[]) {
        int n = array.length;
        int aux;
        boolean swap = false;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (array[k] > array[k + 1]) {
                    aux = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = aux;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
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
