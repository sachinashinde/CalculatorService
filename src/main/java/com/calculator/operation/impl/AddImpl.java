package com.calculator.operation.impl;

import com.calculator.operation.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * Created by sachin on 4/4/2017.
 */
public class AddImpl implements Command{
    private static final Logger logger = LoggerFactory.getLogger(AddImpl.class);

    @Override
    public int execute(int value1, int value2) {
        return 0;
    }
}
