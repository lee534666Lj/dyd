package com.neu.dyd.thread;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/21 23:17
 *--学海无涯苦作舟--
 */
public class MyThead extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 400; i++) {
            System.out.println("demo run----"+i);
        }
    }

}
