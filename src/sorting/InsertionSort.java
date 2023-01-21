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
            INSERTION SORT:

    Complexity:
        Best Case: O(n)
        Average Case: O(n^2)
        Worst Case: O(n^2)
 */
public class InsertionSort {

    public static int[] insertionSort(int array[]) {
        int n = array.length;
        int k;
        for (int i = 0; i < n; i++) {
            k = i;
            while (k > 0 && array[k - 1] > array[k]) {
                int aux = array[k];
                array[k] = array[k - 1];
                array[k - 1] = aux;
                k--;
            }
        }
        return array;
    }
}
