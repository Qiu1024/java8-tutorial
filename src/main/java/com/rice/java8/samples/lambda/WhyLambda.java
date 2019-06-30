package com.rice.java8.samples.lambda;

import com.rice.java8.samples.test.AbstractBaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 为什么需要使用Lambda
 *
 * @author wmh
 * @date 2019-06-30
 */
public class WhyLambda extends AbstractBaseTest {

    private List<Integer> intlist = Arrays.asList(88, 55, 33, 99, 11, 44, 100, 0);

    @Before
    @Override
    public void beforeInit() {
        System.out.println("排序前：" + intlist.toString());
    }

    @Test
    public void beforeLambda() {
        printCurrentMethod("0.不使用Lambda的时候");
        intlist.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    @Test
    public void useLambda1() {
        printCurrentMethod("1.省略匿名类");
        intlist.sort((Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );
    }

    @Test
    public void useLambda2() {
        printCurrentMethod("2.省略匿名类,参数类型");
        intlist.sort((o1, o2) -> {
                    return o1 - o2;
                }
        );
    }

    @Test
    public void useLambda3() {
        printCurrentMethod("3.省略匿名类,参数类型,return,大括号");
        intlist.sort((o1, o2) -> o1 - o2);
    }

    @Override
    public void printCurrentMethod(String methodComment) {
        System.out.println("当前方法： " + methodComment);
    }

    @After
    @Override
    public void afterDone() {
        System.out.println("排序后：" + intlist.toString());
        System.out.print("\n\n");
    }

}

