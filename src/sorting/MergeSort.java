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
            MERGE SORT: 

    Complexity:
        Best Case: O(n.log n)
        Average Case: O(n.log n)
        Worst Case: O(n.log n)
 */
public class MergeSort {

    public static int[] mergeSort(int array[], int begin, int end) {

        if (end > begin) {
            int middle = (begin + end) / 2;
            mergeSort(array, begin, middle);
            mergeSort(array, middle + 1, end);
            merge(array, begin, middle, end);
        }

        return array;
    }

    public static void merge(int array[], int begin, int middle, int end) {

        int i = begin;
        int j = middle + 1;
        int temp[] = new int[10];
        int k;

        for (k = begin; k <= end; k++) {
            temp[k] = array[k];
        }

        for (k = begin; k <= end; k++) {
            if (i > middle) {
                array[k] = temp[j];
                j++;
            } else if (j > end) {
                array[k] = temp[i];
                i++;
            } else if (temp[i] < temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
        }
    }
}
