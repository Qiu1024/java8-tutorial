package com.rice.java8.samples.test;

/**
 * 基础测试接口
 * @author wmh
 * @date 2019-06-30
 */
public interface BaseTest {
    /**
     * 测试前
     */
    void beforeInit();

    /**
     * 打印当前方法名
     * @param methodComment
     */
    void printCurrentMethod(String methodComment);

    /**
     * 测试后
     */
    void afterDone();

}
