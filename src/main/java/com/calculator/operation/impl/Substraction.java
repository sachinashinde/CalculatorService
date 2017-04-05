package com.calculator.operation.impl;

import com.calculator.operation.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sachin on 4/4/2017.
 */
public class Substraction implements Command {
    private static final Logger logger = LoggerFactory.getLogger(Substraction.class);

    public int execute(int value1, int value2) {
        logger.info("Executed substraction");
        return value1 - value2;
    }
}
