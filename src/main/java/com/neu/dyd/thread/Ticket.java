package com.neu.dyd.thread;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/22 21:47
 *--学海无涯苦作舟--
 */
public class Ticket implements Runnable {

    private int i=100;

    @Override
    public void run() {
        Object object=new Object();
        synchronized (object){
        while (true){
            if(i>0){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i--);
            }
        }}
    }
}
