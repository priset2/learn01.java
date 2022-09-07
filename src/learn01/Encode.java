package learn01;

import java.util.Scanner;
public class Encode {

    public static void encode()
    {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] t  = new int[4];
      for(int i =0;i<4;i++ )
      {
          int temp= (target %10)+5;
          t[i]=temp%10;
          target/=10;

      }
      for (int i=0;i<4;i++)
        {
            System.out.print(t[i]);
        }










    }

    public static void main(String [] args)

    {
             encode();
    }
}
