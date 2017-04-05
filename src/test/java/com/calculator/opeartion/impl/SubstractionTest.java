package com.calculator.opeartion.impl;

import com.calculator.operation.impl.Addition;
import com.calculator.operation.impl.Substraction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sachin on 4/4/2017.
 */
public class SubstractionTest {

    private Substraction substraction;

    @Before
    public void setUp(){
        substraction = new Substraction();
    }

    @Test
    public void executeTest() {
        assertEquals(0, substraction.execute(0, 0));
        assertEquals(-1, substraction.execute(0, 1));
        assertEquals(1, substraction.execute(0, -1));
        assertEquals(2, substraction.execute(1, -1));
        assertEquals(0, substraction.execute(-1, -1));
    }

    private void assertEquals(int expected, int execute) {
        Assert.assertEquals(expected, execute);
    }

}
