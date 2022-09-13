package learn01;
//封装与类
/*
*
* @description C等面向过程的语言，存在数据与函数分离的问题，数据的变化路线不清晰，导致正确性下降
*Java将数据与操作封装到一起，模拟显现实世界结构
*对象：名称，属性（数据），方法（函数）
*不同对象之间进行信息传递，称为"消息通信"
*消息格式：接受对象，请求功能，传递数据，、返回结果
*常见关系：组合，关联，使用

*面向对象特点：封装，继承，多态


*类：类是对象的抽象，将事物的共同属性提取集合；对象是类的实例
*
*


方法分类：普通方法，非静态方法
* @ author priest
* @ date 2022-09-09
 */

import java.util.*;

class Student
{
     private
     int code;
           private  String name;
            Boolean isSchool;
    Student(int a, String b, Boolean c)
    {
        this.code=a;
        this.name=b;
        this.isSchool=c;
    }
    Student()
    {

    }
    public
    void getCode()
    {
        System.out.println(code);
    }



}

public class Learn03
{
    static Scanner sc  = new Scanner(System.in);
    public static void main(String [] args)
    {
         Student st = new Student(12,"wad",true);


    }

}
