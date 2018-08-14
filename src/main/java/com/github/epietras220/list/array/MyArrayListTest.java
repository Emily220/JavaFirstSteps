package com.github.epietras220.list.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
//    MyArrayList a;
//
//    @BeforeEach
//    void setup() {
//        a = new MyArrayList();
//    }

    @Test
    void whenArrayIsEmpty_thenTrue() {
        //given
        MyArrayList a = new MyArrayList();

        //then
        assertTrue(a.isEmpty());
    }

    @Test
    void whenArrayIsEmpty_thenFalse() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertFalse(a.isEmpty());
    }

    @Test
    void ifObjectNotContainsInTheList_thenFalse() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertFalse(a.contains("surname"));
    }

    @Test
    void ifObjectContainsInTheList_thenTrue() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertTrue(a.contains("name"));

    }

    @Test
    void whenArrayContainsSomething_thenNotNull() {
        MyArrayList a = new MyArrayList();
        String name = "Emilka";
        a.add(name);

        assertNotNull(a.get(0));
    }

    @Test
    void whenListIsEmpty_thenArrayIsEmpty() {
        //given
        MyArrayList a = new MyArrayList();

        //when
        Object[] excepted = {};
        Object[] actual = a.toArray();

        //then
        assertArrayEquals(excepted, actual, "The list is empty");
    }

    @Test
    void whenTheListIsConvertToArray_thenArrayHasTheSameSizeAsList() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");

        //when
        int expectedSize = a.size();
        int actualSize = a.toArray().length;

        //then
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void whenTheListIsConvertToArray_thenPositionsOfElementsIsTheSame() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");

        //when
        Object[] actualArray = a.toArray();

        //then
        assertEquals(a.get(1), actualArray[1]);
    }

    @Test
    void whenAddElementToList_thenSizeIncrease() {
        MyArrayList a = new MyArrayList();
        a.add("name");

        assertEquals(1, a.size());

    }

    @Test
    void whenRemoveElement_thenSizeDecrease() {
        MyArrayList a = new MyArrayList();
        a.add("name1");
        a.add("name2");
        a.remove("name1");

        assertEquals(1, a.size());
    }

    @Test
    void whenRemoveOnlyElement_thenSizeZero() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //when
        a.remove("name");

        //then
        assertEquals(0, a.size());
    }

    @Test
    void whenRemoveFirstElement_thenSecondElementIsFirst() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name1");
        a.add("name2");

        //when
        a.remove(0);

        //then
        assertEquals("name2", a.get(0));
    }
    @Test
    void whenAddAnotherElementToList_thenPutThisAtTheEnd(){
        //given
        MyArrayList a = new MyArrayList();
        a.add("name1");

        //when
        a.add("another name");

        //then
        assertEquals(1, a.indexOf("another name"));
    }


    @Test
    void testIndexOutOfBoundsException() {
        MyArrayList a = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> a.get(0)); // wyrażenie lambda jest to metoda, która może być wstawiona jako argument do innej metody
        // brak parametrów, ciałem metody jest a.get();
    }

    @Test
    void whenDeleteElementThatNotExist_thenFalse() {
        //given
        MyArrayList a = new MyArrayList();

        //when
        a.add("name");

        //then
        assertFalse(a.remove("surname"));
    }

    @Test
    void whenInArrayIsTwoSameElement_thenDeleteFirst() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("otherName");
        a.add("name");

        //when
        a.remove("name");

        //then
        assertEquals("otherName", a.get(0));
    }

    @Test
    void whenAddCollectionToList_thenPutAllAtTheEnd_andSizeIncreaseByTheLengthCollection() {
        //given
        MyArrayList a = new MyArrayList();
        MyArrayList list = new MyArrayList();

        //when
        a.add("name");
        a.add("surname");

        list.add("name2");
        list.add("name3");

        a.addAll(list);

        //then
        assertAll(
                () -> assertEquals(2, a.indexOf("name2")),
                ()-> assertEquals(4, a.size())
        );
    }

    @Test
    void afterClearArray_IsEmpty() {
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.remove("name");

        assertTrue(a.isEmpty());
    }

    @Test
    void whenIndexEqualsSize_thenMethodGetThrowException() {

        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");

        //then
        assertThrows(IndexOutOfBoundsException.class, () -> a.get(2));
    }

    @Test
    void whenIndexLowerThanZero_thenMethodGetThrowException() {
        //given
        MyArrayList a = new MyArrayList();

        //then
        assertThrows(IndexOutOfBoundsException.class, () -> a.get(-1), "Index cannot be lower than 0");

    }

    @Test
    void whenIndexLowerSize_thenMethodGetReturnElementAtTheSpecifiedPosition() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");

        //then
        assertEquals("surname", a.get(1));
    }

    @Test
    void whenSetElement_thenSizeNotIncrease() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //when
        a.set(0, "surname");

        //then
        assertEquals(1, a.size());
    }

    @Test
    void whenSetElement_thenReplacePrevious() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //when
        a.set(0, "surname");

        //then
        assertNotEquals("name", a.get(0));
    }

    @Test
    void whenIndexInSetMethodIsLowerThanZeroOrBiggerThanSizeList_thenThrowExceptions(){
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertAll(
                ()-> assertThrows(ArrayIndexOutOfBoundsException.class, ()-> a.set(-2, "name2")),
                ()-> assertThrows(ArrayIndexOutOfBoundsException.class, ()->a.set(2, "name3"))
        );
    }

    @Test
    void ifInListAreTwoTheSameElements_MethodIndexOfNotReturnSecondElementIndex() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");
        a.add("name");

        //then
        assertNotEquals(2, a.indexOf("name"));
    }

    @Test
    void ifNotExistElementInTheList_methodIndexOfReturnMinusOne() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertEquals(-1, a.indexOf("surname"));

    }

    @Test
    void ifInListAreTwoTheSameElements_methodLastIndexOfReturnLastIndex() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");
        a.add("surname");
        a.add("name");

        //then
        assertEquals(2, a.lastIndexOf("name"));
    }

    @Test
    void ifNotExistElementInTheList_methodLastIndexOfReturnMinusOne() {
        //given
        MyArrayList a = new MyArrayList();
        a.add("name");

        //then
        assertEquals(-1, a.lastIndexOf("surname"));
    }

    @Test
    void subList() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void whenSecondListHasTheSameElementsAsFirstList_thenRemoveAllFromFirstList() {
        //given
        MyArrayList a = new MyArrayList();
        MyArrayList list = new MyArrayList();

        a.add("name");
        a.add("surname");

        list.add("name");
        list.add("surname");

        //when
        a.removeAll(list);

        //then
        assertEquals(0, a.size());
    }


    @Test
    void whenListContainsAllElementAnotherList_thenMethodContainsAllReturnTrue() {
        //given
        MyArrayList a = new MyArrayList();
        MyArrayList list = new MyArrayList();

        a.add("name");
        a.add("surname");

        list.add("name");
        list.add("surname");

        //then
        assertTrue(a.containsAll(list));
    }

    @Test
    void whenAddedListContainsMoreElementThanFirstList_thenMethodContainsAllReturnFalse(){
        //given
        MyArrayList a = new MyArrayList();
        MyArrayList list = new MyArrayList();

        a.add("name");
        a.add("surname");

        list.add("name");
        list.add("surname");
        list.add("another name");

        //then
        assertFalse(a.containsAll(list));
    }
    @Test
    void whenAddedListContainsDifferentElement_thenMethodContainsAllReturnFalse(){
        //given
        MyArrayList a = new MyArrayList();
        MyArrayList list = new MyArrayList();

        a.add("name");
        a.add("surname");

        list.add("name");
        list.add("another");

        //then
        assertFalse(a.containsAll(list));
    }

}