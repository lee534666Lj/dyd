package com.neu.dyd.thread;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/21 23:27
 * --学海无涯苦作舟--
 */
public class ThreadDemo {

    public static void main(String[] args) {
       /* MyThead myThead=new MyThead();
        myThead.start();
        for (int i = 0; i <60; i++) {
            System.out.println("hello world:"+i);
        }*/

        Ticket ticket = new Ticket();
        Thread thread1=new Thread(ticket);
        Thread thread2=new Thread(ticket);
        Thread thread3=new Thread(ticket);
        Thread thread4=new Thread(ticket);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
