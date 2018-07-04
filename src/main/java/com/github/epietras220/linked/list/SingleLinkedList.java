package com.github.epietras220.linked.list;


public class SingleLinkedList<E> {

    private Node<E> first; // wskaźnik pierwszego elementu

    private static class Node<E> {
        private E element; // atrybut ten przechowuje wartość z danego węzła
        private Node<E> next; // wskaźnik do kolejnego węzła

        Node(E element) {
            this.element = element;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int size = 0;
        Node<E> currentNode = first;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public E get(int index) {
        Node<E> currentNode = first;
        int currentIndex = index;
        while (currentIndex > 0) {
            currentNode = currentNode.next;
            currentIndex--;
        }
        return currentNode.element;
    }

}
