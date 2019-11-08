package com.moduleTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class AcceptableStringTest {

    @Test
    public void parsingStringTest() {
        AcceptableString parsingString = new AcceptableString();
        boolean result = parsingString.parsing("");
        assertTrue(result);
    }
    @Test
    public void parsingStringTest2() {
        AcceptableString parsingString = new AcceptableString();
        boolean result = parsingString.parsing("()(){}");
        assertTrue(result);
    }
}
