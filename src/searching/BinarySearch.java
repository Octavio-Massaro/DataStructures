/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Octavio Massaro
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer between 0 to 9: ");
        int x = scan.nextInt();
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int position = binarySearch(x, array, 0, array.length - 1);

        if (position == -1) {
            System.out.printf("Element %d not found in array\n", x);
        } else {
            System.out.printf("The element %d was found at position %d\n", x, position);
        }

    }

    public static int binarySearch(int x, int array[], int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (x < array[mid]) {
                return binarySearch(x, array, start, mid-1);

            } else if (x > array[mid]) {
                return binarySearch(x, array, mid+1, end);

            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }
}
