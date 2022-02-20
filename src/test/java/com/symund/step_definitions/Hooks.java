package com.symund.step_definitions;

import com.symund.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        Driver.closeDriver(); //

    }
}
