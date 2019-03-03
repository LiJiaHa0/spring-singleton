package com.ljh.study.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 注册式单例模式Map容器
 * @author: Jh Lee
 * @create: 2019-03-03 01:55
 **/
public class RegisterMap {

    //先声明一个注册容器
    private static Map<String,RegisterMap> register = new HashMap<String, RegisterMap>();

    //从容器中获取单例
    public static RegisterMap getInstance(String name){
        //首先做name的控制判断
        if(name == null){
            name = RegisterMap.class.getName();
        }

        //如果注册容器中没有相应的值，往容器中添加一个实例化过的对象
        //如果容器中存在，则直接返回
        if(register.get(name) == null){
            try {
                register.put(name,new RegisterMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}
