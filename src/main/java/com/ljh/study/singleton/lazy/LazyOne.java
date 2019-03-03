package com.ljh.study.singleton.lazy;

/**
 * @description: 懒汉式单例第一种
 * @author: Jh Lee
 * @create: 2019-03-03 01:36
 **/
public class LazyOne {

    //私有的构造方法，防止new出新对象
    private LazyOne(){};

    //静态属性
    private static LazyOne lazyOne = null;

    //获取单例方法,如果属性中的对象未实例化，则实例化对象，如果实例化了，直接返回
    //线程不安全的一种做法
    public static LazyOne getInstance(){
        if(lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
