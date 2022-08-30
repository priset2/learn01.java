package learn01;

import java.util.Scanner;

public class learn01 {
    //题目一，转化温度
    public static void temperature()
    {
         int a =0;
        System.out.println("请输入摄氏温度");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        double b = (a - 32) * 5 / 9.0;
        String s2=String.format("%.1f",b);
        System.out.println(s2);
    }
    // 题目二 求三角形面积
    public static void square()
    {
       int a,b,c=0;
       a=b=c;
        System.out.println("请输入a，b，c三边长");
        Scanner input = new Scanner(System.in);
         a = input.nextInt();
       b=input.nextInt();
       c=input.nextInt();
        double s=(a+b+c)/2.0;
        double middle = s*(s-a)*(s-b)*(s-c);
        double end =Math.sqrt(middle);
        String s2=String.format("%.3f",end);
        System.out.println(s2);
    }

    public static void main(String[] args)
    {
        int a=0;
        System.out.println("1.转化温度,2. 求三角形面积；0。退出;请输入序号：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        switch (a) {
            case 0 :
                break;

            case 1:
                temperature();
                break;

            case 2:square();
            break;
        }




    }
}
