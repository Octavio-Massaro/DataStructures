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
            SHELL SORT:

    Complexity:
        Best Case: ?
        Average Case: ?
        Worst Case: ?
 */
public class ShellSort {

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
}
