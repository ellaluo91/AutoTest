package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnCalss1 {

    public void stu1(){
        System.out.println("class1, stu1");
    }

    public void stu2(){
        System.out.println("class1, stu2");
    }
}
