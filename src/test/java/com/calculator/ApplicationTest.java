package com.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

/**
 * Created by sachin on 4/4/2017.
 */
public class ApplicationTest {
    @Rule
    public OutputCapture outputCapture = new OutputCapture();
    
    @Test
    public void testLoadedCustomLogbackConfig() throws Exception {
        Application.main(new String[0]);
        this.outputCapture.expect(containsString("Welcome to spring boot demo app"));
        this.outputCapture.expect(not(containsString("Sample Trace Message")));
    }
}
