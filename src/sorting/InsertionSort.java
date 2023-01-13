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
public class InsertionSort {
    public static void main(String[] args){
        int array[] = new int[10];
        array = creatingArray(array);
        array = insertionSort(array);
        print(array);    
    }
    
    public static int[] creatingArray(int array[]){
        Random rand = new Random();
        
        for(int i = 0;i < 10;i++){
            array[i] = rand.nextInt(100);
        }
        
        return array;
    }
    
    public static int[] insertionSort(int array[]){
        int n = array.length;
        int k;
        for(int i = 0; i < n;i++){
            k = i;
            while(k > 0  && array[k-1] > array[k]){
                int aux = array[k];
                array[k] = array[k-1];
                array[k-1] = aux;
                k--;
            }
        }
        return array;
    }
    
    public static void print(int array[]){
        for(int i = 0;i < 10;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
