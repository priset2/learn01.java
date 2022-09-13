package learn01;
import java.util.Scanner;
public class Subway {
    public  static void jishu()
    {
        Scanner sc  = new Scanner(System.in);
        int a =sc.nextInt();
        if(a<=6)
        {
            System.out.println("price="+3 );
        }
        else if(a>6&&a<=12)
        {
            System.out.println("price="+4 );
        }
        else if(a>12&&a<=22)
        {
            System.out.println("price="+5 );
        }
        else if(a>22&&a<=32)
        {
            System.out.println("price="+6 );
        }
        else if(a>32&&a<=52)
        {
            System.out.println("price="+7 );
        }
        else
        {
            int b =(a - 32)/20;

           // System.out.println(b);
            int c =b+7;
            System.out.println("price="+c );
        }

    }
    public static void main(String [] args)
    {
            jishu();
    }
}
