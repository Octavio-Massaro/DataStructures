/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import interfaces.Stackable;

/**
 *
 * @author Octavio Massaro
 */
public class Stack<E> implements Stackable {

    private Stack<E> previous;
    private E value;
    private int size = 0;

    public Stack() {
    }

    public Stack(E value) {
        this.value = value;
    }

    public Stack(Stack<E> previous, E value) {
        this.previous = previous;
        this.value = value;
    }

    @Override
    public void push(Object value) {
        this.previous = new Stack<E>(this.previous, this.value);
        this.value = (E) value;
        size++;

    }

    @Override
    public Object pop() {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        E top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;
        size--;

        return top;
    }

    @Override
    public Object peek() {
        return this.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void iterate(Stack stack) {
        for (int i = size; i > 0; i--) {
            System.out.println(stack.pop());
        }
    }
}
