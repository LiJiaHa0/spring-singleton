package com.ljh.study.singleton.lazy;

/**
 * @description: 懒汉式单例第三种（静态内部类）
 * @author: Jh Lee
 * @create: 2019-03-03 01:45
 **/
public class LazyThree {

    //私有的构造方法
    //如果使用LazyThree是，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyThree(){};

    //开放给外部的获取实例的方法
    public static final LazyThree getInstance(){
        return LazyHolder.LAZY_THREE;
    }

    //静态内部类，用于提供实例化单例
    public static class LazyHolder{
        private static final LazyThree LAZY_THREE = new LazyThree();
    }
}
