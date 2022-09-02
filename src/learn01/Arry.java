package learn01;
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.random.*;
import java.util.Scanner;
import static java.util.Arrays.sort;
//1 ....简略方式
//2 java数组支持非矩形数组,重点在
//3.for each 循环
public class Arry {
    public static void main (String [] args)
    {
        int size =10;
Random r = new Random();


        int[] arryList = new int [size];
        for(int i=0;i<10;i++)
        {
            int x =r.nextInt(100);
            arryList[i]= x;
        }
     for(int element : arryList)
     {
         System.out.println(element);
     }
 System.out.println("_________________________________");
        //  System.out.println(Arrays.stream(arryList).sum());
      sort (arryList);

        for(int element : arryList)
        {
            System.out.println(element);
        }

        int [][] arry =new int [3][3];
        for(int i=0;i<arry.length;i++)
        {
            for(int j=0;j< arry.length;j++)
            {
                int x =r.nextInt(100);
                arry[i][j]= x;

            }
        }
        for(int i=0;i<arry.length;i++)
        {
            for(int j=0;j< arry[i].length;j++)
            {
                System.out.print(arry[i][j]+ " ");

            }
            System.out.println();
        }

        ArrayList <Integer> al = new ArrayList<Integer>();

        for(int i=0;i<10;i++)
        {
            al.add(r.nextInt(100));
        }
       //al.sort();
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int b  = sc.nextInt();

int a []= new int [] {1,2,3};

output(a);
    }
    public static void output(int a[])
    {
        for(int i=0;i<a.length;i++)
        {

                System.out.print(a[i]+ " ");


        }
    }

}
