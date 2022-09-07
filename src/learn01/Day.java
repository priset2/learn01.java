package learn01;

import java.util.Scanner;
public class Day {
    public static void day()
    {
        int year=0,month=0,day=0;
        Scanner sc = new Scanner(System.in);
        year =sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
     Boolean lunaryear= LunarYear(year);
     int [] monthday = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
     if(lunaryear)
     {
         monthday[1]+=1;
     }
     int sum=0;
        for(int i=0;i<month-1;i++){
            sum+=monthday[i];
        }
        sum+=day;
        System.out.println(sum);
    }
  public static Boolean LunarYear(int year)
  {
      if(year %4==0&&year%100!=0)
      {
          return true;
      }
          else if (year%400==0)
      {
          return true;
      }
          else
      {
          return false;
      }
  }

    public static  void  main(String [] args)
    {
     day();
    }

}
