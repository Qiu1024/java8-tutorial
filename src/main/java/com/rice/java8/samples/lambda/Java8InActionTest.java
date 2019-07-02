package com.rice.java8.samples.lambda;

import com.rice.java8.samples.test.AbstractBaseTest;
import org.junit.Test;

/**
 * 测验3.4:函数式接口 对于下列函数描述符(即Lambda表达式的签名)，你会使用哪些函数式接口?在表3-2中
 * 可以找到大部分答案。作为进一步练习，请构造一个可以利用这些函数式接口的有效Lambda 表达式:
 * (1) T->R
 * (2) (int, int)->int
 * (3) T->void
 * (4) ()->T
 * (5) (T, U)->R
 */
public class Java8InActionTest extends AbstractBaseTest {

    @Test
    public void testFun1() {
        Fun1 f1 = (t) -> t.hashCode();
        System.out.println("T -> R");
        System.out.println(f1.whatEver("I'm T Object! return value it's my hascode! "));
    }

    @Test
    public void testFun2() {
        Fun2 f2 = (a, b) -> a + b + 100;
        System.out.println("(int, int)->int");
        System.out.println(f2.whatEver_JustASign(1, 2));
    }

    @Test
    public void testFun3() {
        Fun3 f3 = (t) -> System.out.println("T -> void");
        f3.xxx("what ever value pass in ");
    }

    @Test
    public void testFun4() {
        Fun4<String> f4 = () -> "only String can return";
        System.out.println(" ()->T ");
        System.out.println(f4.aaa());
    }

    @Test
    public void testFun5() {
        Fun5<String,Integer,Long> f5 = (t,u) -> (long)(t.length() * u);
        System.out.println(" (T, U)->R ");
        System.out.println(f5.bbb("hello",10));
    }

}


/**
 * T->R
 *
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
interface Fun1<T, R> {
    R whatEver(T t);
}

/**
 * (int, int)->int
 */
@FunctionalInterface
interface Fun2 {
    int whatEver_JustASign(int a, int b);
}

/**
 * T->void
 */
@FunctionalInterface
interface Fun3<T> {
    void xxx(T t);
}

/**
 * ()->T
 */
@FunctionalInterface
interface Fun4<T> {
    T aaa();
}

/**
 * (T, U)->R
 */
@FunctionalInterface
interface Fun5<T, U, R> {
    R bbb(T t, U u);
}