package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu2")
public class GroupsOnCalss2 {

    public void stu1(){
        System.out.println("class2, stu1");
    }

    public void stu2(){
        System.out.println("class2, stu2");
    }
}
