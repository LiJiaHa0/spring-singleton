package com.ljh.study.singleton.hungry;

/**
 * @description: 饿汉式单例模式
 * @author: Jh Lee
 * @create: 2019-03-02 22:25
 **/
public class Hungry {

    //私有的构造方法
    private Hungry(){}

    //------类加载顺序------
    //先静态、后动态
    //先属性、后方法
    //先上后下

    //私有静态属性，加final为了对象初始化，别人避免把他覆盖。（static加在属性上，属性的值不会被改变）
    private static final Hungry hungry = new Hungry();

    //开外给外部的获取实例的方法
    public Hungry getHungry(){
        return hungry;
    }
}
