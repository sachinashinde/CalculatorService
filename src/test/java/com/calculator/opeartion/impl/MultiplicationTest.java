package com.calculator.opeartion.impl;

import com.calculator.operation.impl.Multiplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sachin on 4/4/2017.
 */
public class MultiplicationTest {

    private Multiplication multiplication;

    @Before
    public void setUp(){
        multiplication = new Multiplication();
    }

    @Test
    public void executeTest() {
        assertEquals(0, multiplication.execute(0, 0));
        assertEquals(0, multiplication.execute(0, 1));
        assertEquals(0, multiplication.execute(0, -1));
        assertEquals(-1, multiplication.execute(1, -1));
        assertEquals(1, multiplication.execute(-1, -1));
    }

    private void assertEquals(int expected, int execute) {
        Assert.assertEquals(expected, execute);
    }

}
