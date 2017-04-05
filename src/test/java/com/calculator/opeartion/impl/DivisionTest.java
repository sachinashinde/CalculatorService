package com.calculator.opeartion.impl;

import com.calculator.operation.impl.Division;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

/**
 * Created by sachin on 4/4/2017.
 */
public class DivisionTest {

    private Division division;

    @Before
    public void setUp() {
        division = new Division();
    }

    @Test
    public void executeTest() {
        assertEquals(0, division.execute(0, 0));
        assertEquals(0, division.execute(0, 1));
        assertEquals(0, division.execute(0, -1));
        assertEquals(-1, division.execute(1, -1));
        assertEquals(1, division.execute(-1, -1));
    }

    private void assertEquals(Object expected, int execute) {
        Assert.assertEquals(expected, execute);
    }

}
