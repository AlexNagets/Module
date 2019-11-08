package com.moduleTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleAreaTest {

    @Test
    public void triangleArea() {

        TriangleArea triangleAreaActual = new TriangleArea();
        int result = (int) triangleAreaActual.TriangleArea( new  int[][] {{0,0},{0,2},{2,0},{0,4},{4,0}});
        assertEquals(8, result);
    }


}