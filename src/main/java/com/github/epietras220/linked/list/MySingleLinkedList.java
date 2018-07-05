package com.github.epietras220.linked.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MySingleLinkedList<E> implements List<E> {

    private Node<E> head; // wskaźnik pierwszego elementu


    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return head.nodesBehind() + 1;
    }

    @Override
    public boolean isEmpty() {

        return head == null;
    }

    @Override
    public boolean contains(Object o) {

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        // head.addNode(e);
        if (head == null) {
            head = new Node<>(e);
        } else {
            Node<E> temp = head;
            while (temp.nodesBehind() != 0) {
                temp = temp.getNext();  // szukam ostatniego wagonu
            }
            temp.setNext(new Node<>(e));
        }
        return true;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public E get(int index) {
//        Node<E> temp = head;
//        for (int i = 0; i < index; i++) {
//            if (temp == null) {
//                throw new IndexOutOfBoundsException(String.valueOf(i));
//            }
//            temp = temp.getNext();
//        }
//        return temp.getValue();
        Node<E> temp = head;
        int size = size();
        while (size > index) {
            temp = temp.getNext();
            size--;

        }
        return temp.getValue();
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
