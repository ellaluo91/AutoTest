package com.course.testng.mutilThread;

import org.testng.annotations.Test;

public class MutilThreadOnAnnotion {

    @Test
    public void test(){
        System.out.println(1);
        System.out.println("Thread Id : "+ Thread.currentThread().getId());
    }

}
