/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package some_famous_algorithms;

/**
 *
 * @author Octavio Massaro
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        int rings = 4;

        towerOfHanoi(rings, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int rings, char begin, char end, char aux) {

        if (rings == 0) {
            return;
        }
        
        towerOfHanoi(rings - 1, begin, aux, end);
        System.out.printf("Move ring %d from rod %c to rod %c\n", rings, begin,end);
        towerOfHanoi(rings - 1, aux, end, begin);


    
}
}
