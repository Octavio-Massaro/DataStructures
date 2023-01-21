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
            HEAP SORT:

    Complexity:
        Best Case: O(n.log n)
        Average Case: O(n.log n)
        Worst Case: O(n.log n)
 */
public class HeapSort {

    public static int[] heapSort(int array[]) {
        int n = array.length - 1;
        int i;
        int aux;
        for (i = (n - 1) / 2; i >= 0; i--) {
            sink(array, i, n);
        }

        while (n > 0) {
            aux = array[0];
            array[0] = array[n];
            array[n] = aux;
            n--;

            sink(array, 0, n);
        }

        return array;
    }

    public static void sink(int array[], int i, int n) {
        int j;
        int aux;

        while (2 * i + 1 <= n) {
            j = 2 * i + 1;
            if (j < n && array[j] < array[j + 1]) {
                j = j + 1;
            }

            if (array[i] >= array[j]) {
                break;

            }
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            i = j;
        }
    }

}
