package com.github.epietras220.first.tests.practise;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BooleanSupplier;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class FirstMethodsTest {

    @Test
    void givenEvenNumber_whenCheckingIsNumberEven_thenTrue() {
        FirstMethods bean = new FirstMethods();
        boolean result = bean.isNumberEven(8);

        assertTrue(result);
    }

    @Test
    void givenOddNumber_whenCheckingIsNumberEven_thenFalse() {
        FirstMethods bean = new FirstMethods();
        boolean result = bean.isNumberEven(3);

        assertFalse(result);
    }

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = {'J', 'u', 'p', 'i', 't', 'e', 'r'};
        char[] actual = "Jupiter".toCharArray();

        assertArrayEquals(expected, actual, " Arrays should be equal");
    }

    @Test
    public void whenAssertingEquality_thenEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 2;

        assertEquals(square, rectangle);
    }

    @Test
    public void whenAssertingEqualityWithDelta_thenEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 3;
        float delta = 2;

        assertEquals(square, rectangle, delta);
    }

    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, " null is equal to null");

    }

    @Test
    void givenBooleanSupplier_whenAssertingCondition_thenVerified() {
        BooleanSupplier condition = () -> 5 > 6;

        assertFalse(condition, "5 is not greater then 6");

    }

    @Test
    public void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();

        assertNotNull(dog, () -> "the dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;

        assertNull(cat, "the cat should be null");
    }

    @Test
    public void whenAssertingSameObject_thenSucessfull() {
        String language = "Java";
        Optional<String> optional = Optional.of(language);

        assertSame(language, optional.get());
    }

    @Test
    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, " 4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertEquals(null, null, "null is equal to null")
        );
    }

    @Test
    public void givenTwoList_whenAssertingIterables_thenEquals() { // test iterowania; przechodzi gdy dwie listy mają takie same elementy. Mogą być dwie rózne listy np array i linked
        Iterable<String> al = new ArrayList<>(asList("Java", "JUnit", "Test"));
        Iterable<String> ll = new LinkedList<>(asList("Java", "JUnit", "Test"));

        assertIterableEquals(al, ll);
    }

    @Test
    public void whenAssertingEqualityListOfStrings_thenEqual() {
        List<String> expected = asList("Java", "\\d+", "JUnit");
        List<String> actual = asList("Java", "11", "JUnit");

        assertLinesMatch(expected, actual);
    }

    @Test
    public void whenAssertingEquality_thenNotEqual() {
        Integer value = 5;

        assertNotEquals(0, value, " The result cannot be 0");
    }

    @Test
    void whenAssertingException_thenThrown(){
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                ()-> {
                    throw  new IllegalArgumentException("Exception message");
                }
        );
        assertEquals("Exception message", exception.getMessage());
    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded(){
        assertTimeout(
                ofSeconds(2),
                ()->{
                    //code that requires less then 2 minutes to execute
                    Thread.sleep(1000);
                }
        );
    }
}