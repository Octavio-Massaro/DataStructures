/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Random;
import models.Books;
import sorting.QuickSort;
import structures.Stack;

/**
 *
 * @author Octavio Massaro
 */
public class Main {

    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println("Quick Sort:");
        array = creatingArray(array);
        System.out.print("Before: ");
        print(array);
        array = QuickSort.quickSort(array, 0, array.length - 1);
        System.out.print("After: ");
        print(array);
        Stack<Books> stack = new Stack<Books>();
        System.out.println(stack.isEmpty());
        stack.push(new Books(1,"The Hobbit", "fiction"));
        stack.push(new Books(2,"A Game of thrones", "fiction"));
        stack.push(new Books(3,"Lord of the Rings", "fiction"));
        stack.push(new Books(4,"Java - How to program", "IT"));
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.iterate(stack);
        
        
        
        
        
        
    }

    public static int[] creatingArray(int array[]) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
        }

        return array;
    }

    public static void print(int array[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
