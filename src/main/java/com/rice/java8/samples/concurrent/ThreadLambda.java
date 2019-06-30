package com.rice.java8.samples.concurrent;

import com.rice.java8.samples.test.AbstractBaseTest;
import org.junit.Test;

/**
 * 线程Runnable Java8 Lambda写法
 * @author wmh
 * @date 2019-06-30
 */
public class ThreadLambda extends AbstractBaseTest {


    @Test
    public void threadBeforeLambda(){
        printCurrentMethod("threadBeforeLambda");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是一个原始的Runnable线程！！");
            }
        }).start();
    }

    @Test
    public void threadByLambda(){
        printCurrentMethod("threadByLambda");
        new Thread(() -> System.out.println("我是一个Lambda的线程！！"))
        .start();
    }

}
