package com.github.epietras220.linked.list;

public class DoubleLinkedList<E> {
    private Node<E> first;
    private Node<E> last;

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

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
            currentNode = currentNode.next;
            size++;
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

