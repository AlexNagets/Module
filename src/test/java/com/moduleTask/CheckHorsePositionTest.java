package com.moduleTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckHorsePositionTest {


    @Test
    public void checkHorsePositionTest1() {
        CheckHorsePosition position = new CheckHorsePosition();
        boolean result = position.checkHorsePosition(0,0,0,0);
        assertFalse(result);
    }
    @Test
    public void checkHorsePositionTest2() {
        CheckHorsePosition position = new CheckHorsePosition();
        boolean result = position.checkHorsePosition(4,4,3,6);
        assertTrue(result);
    }
    @Test
    public void checkHorsePositionTest3() {
        CheckHorsePosition position = new CheckHorsePosition();
        boolean result = position.checkHorsePosition(10,10,2,2);
        assertFalse(result);
    }
}