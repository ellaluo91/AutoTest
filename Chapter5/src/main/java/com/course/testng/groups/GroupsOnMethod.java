package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "local")
    public void test1(){
        System.out.println("本地测试");
    }

    @Test(groups = "Online")
    public void test2(){
        System.out.println("线上测试");
    }

    @BeforeGroups("Online")
    public void beforeGroups1(){
        System.out.println("beforeGroups线上测试");
    }

    @AfterGroups("Online")
    public void afterGroups1(){
        System.out.println("afterGroups线上测试");
    }

    @BeforeGroups("local")
    public void beforeGroups2(){
        System.out.println("beforeGroups本地测试");
    }

    @AfterGroups("local")
    public void afterGroups2(){
        System.out.println("beforeGroups本地测试");
    }
}
