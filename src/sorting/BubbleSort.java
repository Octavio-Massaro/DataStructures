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
            BUBBLE SORT:

    Complexity:
        Best Case: O(n)
        Average Case: O(n^2)
        Worst Case: O(n^2)
 */
public class BubbleSort {

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
}
