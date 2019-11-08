package com.moduleTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberTest {

    @Test
    public void uniqueNumberInArray() {
        int[] arrayTest = {15, 12, 19, 1, 1, 1, 9, 3, 234, 42};
        UniqueNumber unique = new UniqueNumber();
        int result = unique.uniqueNumberInArray(arrayTest);
        assertEquals(result, 8);
    }
    @Test
    public void uniqueNumberInArray2() {
        int[] arrayTest = {0, 0, 0, 0, 2, 1, 2, 2, 2, 1};
        UniqueNumber unique = new UniqueNumber();
        boolean result = unique.uniqueNumberInArray(arrayTest) == 0;
        assertFalse(result);
    }


}