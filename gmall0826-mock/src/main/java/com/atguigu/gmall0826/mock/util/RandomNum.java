package com.atguigu.gmall0826.mock.util;

/**
 * @author 一袭月色
 * @date 2020/2/6 - 15:09
 */
import java.util.Random;

public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}

