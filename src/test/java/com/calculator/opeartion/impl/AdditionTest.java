package com.calculator.opeartion.impl;

import com.calculator.operation.impl.Addition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sachin on 4/4/2017.
 */
public class AdditionTest {

    private Addition addtion;

    @Before
    public void setUp(){
        addtion = new Addition();
    }

    @Test
    public void addTest() {
        assertEquals(0, addtion.execute(0, 0));
        assertEquals(1, addtion.execute(0, 1));
        assertEquals(-1, addtion.execute(0, -1));
        assertEquals(-2, addtion.execute(-1, -1));
    }

    private void assertEquals(int expected, int execute) {
        Assert.assertEquals(expected, execute);
    }

}
