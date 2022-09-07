package learn01;
import java.util.*;
public class Sentout {
    public static void out()
    {
        Scanner sc = new Scanner(System.in);
        int Pagesize = sc.nextInt();
        int row = sc.nextInt();

        int page =0;
      //  System.out.println(Pagesize%row );
        if(Pagesize%row != 0)
        {
             page = Pagesize/row +1 ;
         //   System.out.println(1);
        }
        else
        {
             page = Pagesize/row ;
           // System.out.println(2);
        }
        System.out.println(page);
    }

    public static void main(String [] args)
    {
          out();
    }

}
