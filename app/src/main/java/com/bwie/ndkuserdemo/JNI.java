package com.bwie.ndkuserdemo;

/**
 * 作者：刘净辉 on 2016/9/19 0019 15:36
 * 邮箱：m18001307178_1@163.com
 * Java调用C语言代码
 */
public class JNI {
    {
        System.loadLibrary("Hello");
    }

    /**
     * 定义native方法调用对应的C语言
     * @return
     */
    public native String sayHello();
}
