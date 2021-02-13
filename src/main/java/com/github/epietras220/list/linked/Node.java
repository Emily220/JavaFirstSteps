package com.github.epietras220.list.linked;

class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E e) {
        this.value = e;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public int nodesBehind() {
        if (next == null) {
            return 0;
        }
        return next.nodesBehind() + 1;
    }
}