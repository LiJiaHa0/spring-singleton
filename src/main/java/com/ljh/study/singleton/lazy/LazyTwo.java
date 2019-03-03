package com.ljh.study.singleton.lazy;

/**
 * @description: 懒汉式单例第二种
 * @author: Jh Lee
 * @create: 2019-03-03 01:36
 **/
public class LazyTwo {

    //私有的构造方法，防止new出新对象
    private LazyTwo(){};

    //静态属性
    private static LazyTwo lazyOne = null;

    //获取单例方法,如果属性中的对象未实例化，则实例化对象，如果实例化了，直接返回
    //这里加了synchronized同步锁是保证线程安全，如果不加synchronized会导致线程不安全，加了synchronized会导致性能极慢
    public static synchronized LazyTwo getInstance(){
        if(lazyOne == null){
            lazyOne = new LazyTwo();
        }
        return lazyOne;
    }
}
