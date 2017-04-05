package com.calculator.operation.impl;

import com.calculator.operation.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sachin on 4/4/2017.
 */
public class Division implements Command {
    private static final Logger logger = LoggerFactory.getLogger(Division.class);

    public int execute(int value1, int value2) {
        logger.info("Executed division");
        if(value2 == 0) return 0;
        return value1 / value2;
    }
}
