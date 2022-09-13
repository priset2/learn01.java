package learn01;
import java.util.*;

public class Point {
    public  static  class point
    {
        int x;
        int y;

        Double distance;
    point ()
    {
        this.y=0;
        this.x=0;
    }
    point (int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    point (int c)
    {
        this.x=this.y=c;
    }

    Double Distance ()
    {
        int a = x*x+y*y;

       Double d = Math.sqrt(a);

       this.distance = d;
       return d;
    }

        Double Distance (int x1,int y1)
        {
            int a = (x-x1)*(x-x1)+(y-y1)*(y-y1);

            Double d = Math.sqrt(a);

            this.distance = d;
            return d;

        }
        Double Distance (point p)
        {
            int tempt = (this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y);


            Double d = Math.sqrt(tempt);

            this.distance = d;
            return d;
        }





    }

    public static void main(String [] args) {
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        point p1 = new point(a, b);
        point p2 = new point(c);
        System.out.printf("%.2f", p1.Distance());
        System.out.println();
        System.out.printf("%.2f", p2.Distance());
        System.out.println();
        System.out.printf("%.2f", p1.Distance(d, e));
        System.out.println();
        System.out.printf("%.2f", p1.Distance(p2));

    }
}
