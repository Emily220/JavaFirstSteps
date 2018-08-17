package com.github.epietras220.list.array;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private Object[] myArrayList;
    private int actualSize = 0;
    private static int INITIAL_SIZE = 20;

    public MyArrayList() {

        myArrayList = new Object[INITIAL_SIZE];
    }

    private void increaseListLength() {

        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length * 2);
    }

    @Override
    public int size() {


        return actualSize;
    }

    @Override
    public boolean isEmpty() {

        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < actualSize; i++) {
            if (myArrayList[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] list = new Object[actualSize];
        System.arraycopy(myArrayList, 0, list, 0, actualSize);
        return list;
    }

    @Override
    public boolean add(Object o) {
        if (myArrayList.length - actualSize >= 1) {
            myArrayList[actualSize] = o;
            actualSize++;
        } else {
            increaseListLength();
            myArrayList[actualSize] = o;
            actualSize++;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < actualSize; i++)
            if (myArrayList[i].equals(o)) {
                System.arraycopy(myArrayList, i + 1, myArrayList, i, actualSize - i - 1);
                actualSize--;
                return true;
            }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] list = c.toArray();
        while (myArrayList.length - (actualSize + list.length) <= 1) {
            increaseListLength();
        }
        for (Object aList : list) {
            myArrayList[actualSize] = aList;
            actualSize++;
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) { //zle
        Object[] list = c.toArray();
        Object[] tempList = new Object[20];
        if (myArrayList.length - (actualSize + c.size()) >= 1) {
            System.arraycopy(myArrayList, index, tempList, 0, actualSize - index);

            for (Object aList : list) {
                myArrayList[index] = aList;
                index++;
            }
            System.arraycopy(tempList, 0, myArrayList, index, tempList.length);

        }
        return true;
    }

    @Override
    public void clear() {
        actualSize = 0;

    }

    @Override
    public E get(int index) {
        if (index < actualSize) {
            return (E) myArrayList[index];
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < actualSize) {
            myArrayList[index] = element;
            return element;
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    @Override
    public void add(int index, E element) {
        if (index < actualSize) {
            if (myArrayList.length - actualSize >= 1) {
                System.arraycopy(myArrayList, index, myArrayList, index + 1, actualSize - index);
                myArrayList[index] = element;
                actualSize++;
            } else {
                increaseListLength();
                System.arraycopy(myArrayList, index, myArrayList, index + 1, actualSize - index);
                myArrayList[index] = element;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    @Override
    public E remove(int index) {
        Object object = myArrayList[index];

        if (index < actualSize) {
            System.arraycopy(myArrayList, index + 1, myArrayList, index, actualSize - index - 1);
            actualSize--;
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (E) object;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < actualSize; i++) {
            if (myArrayList[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = actualSize - 1; i >= 0; i--) {
            if (myArrayList[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List list = new MyArrayList();

        for (int i = 0; i <= toIndex - fromIndex; i++) {
            list.add(i, myArrayList[fromIndex]);
            fromIndex++;

        }
        return list;
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] list = c.toArray();

        int i = 0;
        int j = 0;


        while (i < actualSize) {
            if (myArrayList[i].equals(list[j])) {
                i++;
            } else {
                j++;
                if (j == list.length) {
                    System.arraycopy(myArrayList, i + 1, myArrayList, i, actualSize - i - 1);
                    actualSize--;
                    j = 0;
                    i++;
                }
            }
        }
        actualSize += c.size();
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] list = c.toArray();
        int zmienna = 0;
        int i = 0;
        while (i < actualSize) {
            if (myArrayList[i].equals(list[zmienna])) {
                System.arraycopy(myArrayList, i + 1, myArrayList, i, actualSize - i - 1);
                actualSize--;
                //i++;
            } else {
                zmienna++;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        Object[] list = c.toArray();
        int j = 0;
        int i = 0;
        if (list.length <= actualSize) {

            while (i < actualSize) {
                if (myArrayList[i].equals(list[j])) {
                    i++;
                } else {
                    j++;
                    if (j == list.length) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
