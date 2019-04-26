package com.neu.dyd.stack;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/18 16:04
 *--学海无涯苦作舟--
 */
public class JavaStackTest {

    private int count = 0;

    public void testStack(){
        count++;
        testStack();
    };

    public void test(){
        try {
            testStack();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("stack height:"+count);
        }
    }

    public static void main(String[] args) {
        new JavaStackTest().test();
    }
}
