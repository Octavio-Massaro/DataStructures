/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

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

    public static int[] quickSort(int array[], int begin, int end) {

        if (end > begin) {
            int pivot = partition(array, begin, end);
            quickSort(array, begin, pivot - 1);
            quickSort(array, pivot + 1, end);
        }

        return array;
    }

    public static int partition(int array[], int begin, int end) {
        int pivot = array[end];
        int k = begin;
        int aux;

        for (int i = begin; i < end; i++) {
            if (pivot >= array[i]) {
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
}
