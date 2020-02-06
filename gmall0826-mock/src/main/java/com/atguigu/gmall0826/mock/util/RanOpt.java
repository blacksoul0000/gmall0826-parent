package com.atguigu.gmall0826.mock.util;

/**
 * @author 一袭月色
 * @date 2020/2/6 - 15:06
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}
