package com.calculator.operation.impl;

import com.calculator.operation.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sachin on 4/4/2017.
 */
public class Addition implements Command {
    private static final Logger logger = LoggerFactory.getLogger(Addition.class);

    public int execute(int value1, int value2) {
        logger.info("Executed addition");
        return value1 + value2;
    }
}
