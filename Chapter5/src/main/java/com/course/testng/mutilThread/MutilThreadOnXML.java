package com.course.testng.mutilThread;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import javax.swing.plaf.TableHeaderUI;

public class MutilThreadOnXML {
    @Test
    public void test1(){
        System.out.println("test1");
        System.out.println("Thread Id : "+ Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("test2");
        System.out.println("Thread Id : "+ Thread.currentThread().getId());
    }

    @Test(timeOut = 2000)
    public void test3()throws Exception{
        Thread.sleep(3000);
        System.out.println("test3");
        System.out.println("Thread Id : "+ Thread.currentThread().getId());
    }
}
