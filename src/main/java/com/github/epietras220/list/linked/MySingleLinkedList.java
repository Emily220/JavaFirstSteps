package com.github.epietras220.list.linked;

import java.util.*;

//public  class MySingleLinkedList<E> implements ArrayList
public class MySingleLinkedList<E> implements List<E> {

    private Node<E> head; // wskaźnik pierwszego elementu
    private int size = 0;

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
        Node<E> temp = head;
        while (temp != null) {
            if (o == null ? temp.getValue() == null : temp.getValue().equals(o)) {
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {

        Object[] list = new Object[size];
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            list[i] = temp.getValue();
            temp = temp.getNext();
        }
        return list;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int i = 0;
        for (T object : a) {
            a[i] = object;
            i++;
        }
        return a;
    }

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node<>(e);
        } else {
            Node<E> temp = head;
            while (temp.nodesBehind() != 0) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(e));
        }
        size += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> temp = head;
        Node<E> previous = null;
        while (temp != null) {
            if (o == null ? temp.getValue() == null : temp.getValue().equals(o)) {
                if (previous == null) {
                    this.head = head.getNext();
                } else {
                    previous.setNext(temp.getNext());
                }
                size -= 1;
                return true;
            } else {
                previous = temp;
                temp = temp.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        Node<E> temp = head;
        for (Object a : c) {
            while (!temp.getValue().equals(a)) {
                temp = temp.getNext();
                if (temp.getNext() == null) {
                    return false;
                }
            }
            temp = head;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Node<E> temp = head;
        for (E a : c) {
            while (temp.nodesBehind() != 0) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(a));
        }
        size += c.size();
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (c.isEmpty()) {
            return true;
        }
        Node<E> temp = head;
        Node<E> previous = null;
        int i = 0;
        while (i < index) {
            previous = temp;
            temp = temp.getNext();
            i++;
        }
        i = 0;

        for (E a : c) {
            if (i != 0) {
                previous.setNext(new Node<>(a));
                previous = previous.getNext();
            } else {
                head = new Node<>(a);
                previous = head;
            }

            i++;
        }
        previous.setNext(temp);

        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Node<E> temp = head;
        Node<E> previous = null;
        for (Object a : c) {
            if (!temp.getValue().equals(a)) {
                previous = temp;
                temp = temp.getNext();
            } else {
                if (previous == null) {
                    this.head = head.getNext();
                } else {
                    previous.setNext(temp.getNext());
                }
            }
        }
        size -= c.size();
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Node<E> temp = head;

        for (Object a : c) {
            if (temp.getValue().equals(a)) {
                temp = temp.getNext();
            } else {
                int i = 0;
                while (i < c.size()) {
                    for (Object b : c) {
                        if (temp.getValue().equals(b)) {
                            temp = temp.getNext();
                        } else {
                            i++;
                        }
                        if (i == c.size()) {
                            remove(temp.getValue());
                        }
                    }
                }

            }
        }
        size = size();
        return true;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException(String.valueOf(i));
            }
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    @Override
    public E set(int index, E element) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException(String.valueOf(i));
            }
            temp = temp.getNext();
        }

        temp.setValue(element);
        return temp.getValue();
    }


    @Override
    public void add(int index, E element) {
        Node<E> temp = head;
        Node<E> previous = null;
        if (index == 0) {
            head = new Node<>(element);
            head.setNext(temp);
            size += 1;
            return;

        }
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException(String.valueOf(i));
            }
            previous = temp;
            temp = temp.getNext();
        }

        previous.setNext(new Node<>(element));
        previous = previous.getNext();
        previous.setNext(temp);
        size += 1;
    }

    @Override
    public E remove(int index) {
        Node<E> temp = head;
        Node<E> previous = null;
        if (index == 0) {
            head = temp.getNext();
            size -= 1;
            return null;
        }

        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException(String.valueOf(i));
            }
            previous = temp;
            temp = temp.getNext();

        }
        temp = temp.getNext();
        previous.setNext(temp);
        return null;
    }

    @Override
    public int indexOf(Object o) {

        int index = 0;
        Node<E> temp = head;

        while (index < size()) {
            if (temp.getValue().equals(o)) {
                return index;
            } else {
                temp = temp.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<E> temp = head;
        int index = -1;
        for (int i = 0; i < size(); i++) {

            if (temp.getValue().equals(o)) {
                index = i;
            }
            temp = temp.getNext();
        }
        return index;
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
        Node<E> temp = head;

        for (int i = 0; i < fromIndex; i++) {
            remove(temp.getValue());
            temp = temp.getNext();
        }
        for (int j = fromIndex; j <= toIndex; j++) {
            temp = temp.getNext();
        }
        for (int k = toIndex + 1; k < size(); k++) {
            remove(temp.getValue());
            temp = temp.getNext();
        }

        return null; // metoda działa ale nie wiem jak zwrócić liste List<E>
    }
}
