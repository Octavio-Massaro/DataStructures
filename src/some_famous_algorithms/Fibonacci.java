/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package some_famous_algorithms;

import java.util.Scanner;

/**
 *
 * @author Octavio
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[100];
        System.out.println("Enter an interger: ");
        int x = scan.nextInt();
        System.out.printf("Fib of %d: %d\n", x, fibonacci(array, x));
    }

    public static int fibonacci(int array[], int x) {

        int aux = 1;
        int sum;
        int temp = 1;

        if (x == 1 || x == 2) {
            return 1;
        } else if (x == 0) {
            return 0;
        }
        
        for (int i = 2; i < x; i++) {
            sum = aux + temp;
            temp = aux;
            aux = sum;

        }
        return aux;
    }

}
