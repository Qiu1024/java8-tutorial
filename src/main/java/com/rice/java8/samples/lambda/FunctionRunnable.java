package com.rice.java8.samples.lambda;

/**
 * Lambda函数式要点：<br/>
 * <pre>
 *     要点1：凡标注了@FunctionalInterface 的接口，仅能有一个抽象方法【不包括Java8的default方法和Object对象中的方法，e.g. toString()】；
 *     要点2：凡能够用Lambda表达式的接口，都隐含说明了该接口标注了@FunctionalInterface注解，又或者符合了@FunctionalInterface注解的所有要求；
 *     要点3：编译器之所以知道【() -> System.out.println("funcThread 执行了! ");】对应的是Runnable的哪个方法，是因为本身Runnable接口仅有一个方法；
 *           所以才可以省略了参数类型，方法名，返回值类型，这些都是能够"推断出来的"！
 * </pre>
 *
 * @author wmh
 * @date 2019-06-30
 */
@FunctionalInterface //（要点1）
public interface FunctionRunnable extends Runnable {

//    void executeRun(String xxx); // (要点2)

}

class FunctionRunnableTest {
    public static void main(String[] args) throws InterruptedException {
        // （要点3）
        FunctionRunnable fRun = () -> System.out.println("funcThread 执行了! ");
        Thread funcThread = new Thread(fRun);
        funcThread.start();
        funcThread.join();
        System.out.println("main done...");
    }
}