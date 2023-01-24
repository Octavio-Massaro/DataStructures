/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import structures.Stack;

/**
 *
 * @author Octavio
 */
public interface Stackable<E> {
    public void push(E value);
    public E pop();
    public E peek();
    public boolean isEmpty();
    public int size();
    public void iterate(Stack stake);
}
