package com.ljh.study.singleton.seriable;

import java.io.Serializable;

/**
 * @description: 序列化与反序列化单例模式
 * @author: Jh Lee
 * @create: 2019-03-03 02:08
 **/
public class Seriable implements Serializable {

    //私有的构造方法
    private Seriable(){};

    //声明静态属性并实例化对象
    public static final Seriable INSTANCE = new Seriable();

    //开放给外部的获取单例属性中的对象的方法
    public static Seriable getInstance(){
        return INSTANCE;
    }

    //实现这个方法是为了对象能重复利用，该方法由JVM自动调用
    private Object readResolve(){
        return INSTANCE;
    }

}
