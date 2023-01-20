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
            QUICK SORT:

    Complexity:
        Best Case: O(n.log n)
        Average Case: O(n.log n)
        Worst Case: O(n^2)
*/

public class QuickSort {
    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Quick Sort:");
        array = creatingArray(array);
        System.out.print("Before: ");
        print(array);
        array = quickSort(array, 0, array.length-1);
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

    public static int[] quickSort(int array[], int begin, int end) {

        if (end > begin) {
            int pivot = partition(array,begin,end);
            quickSort(array,begin,pivot-1);
            quickSort(array,pivot+1,end);
        }

        return array;
    }

    public static int partition(int array[], int begin, int end) {
        int pivot = array[end];
        int k = begin;
        int aux;
        
        for(int i = begin;i < end;i++){
            if(pivot >= array[i]){
                aux = array[i];
                array[i] = array[k];
                array[k] = aux;
                k++;
            }
        }
        aux = array[k];
        array[k] = array[end];
        array[end] = aux;
        
        return k;
        
    }

    public static void print(int array[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
