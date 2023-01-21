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
            SELECTION SORT:

    Complexity:
        Best Case: O(n^2)
        Average Case: O(n^2)
        Worst Case: O(n^2)
 */
public class SelectionSort {

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
}
