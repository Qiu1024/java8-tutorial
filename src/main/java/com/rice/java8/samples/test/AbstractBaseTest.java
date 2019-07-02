package com.rice.java8.samples.test;

import org.junit.After;
import org.junit.Before;

/**
 * TODO
 *
 * @author wmh
 * @date 2019-06-30
 */
public class AbstractBaseTest implements BaseTest {

    @Before
    @Override
    public void beforeInit() {
        System.out.println(getClass() + ", beforeInit executed! ");
    }

    @Override
    public void printCurrentMethod(String methodComment) {
        System.out.println(getClass() + ", printCurrentMethod executed! " + methodComment);

    }

    @After
    @Override
    public void afterDone() {
        System.out.println(getClass() + ", afterDone executed! \n\n");
    }
}
