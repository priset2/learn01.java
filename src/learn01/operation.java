package learn01;
import java.util.Scanner;
public class operation {
    public static void operation()
    {
        Scanner sc = new Scanner(System.in);
        char c =sc.next().charAt(0);
      //  sc.next().
        int d =c;

 double a =sc.nextDouble();
 double b =sc.nextDouble();
      switch(d)
      {
          case 42:
              System.out.println(a+"*"+b+"="+(a*b));
              break;
          case 43:
              System.out.println(a+"+"+b+"="+(a+b));
              break;
          case 45:
              System.out.println(a+"-"+b+"="+(a-b));
              break;
          case 47:
              System.out.println(a+"/"+b+"="+(a/b));
              break;
          default: System.out.println("error");
      }
    }
    public static  void main(String[] args)
    {
          operation();
    }
}
