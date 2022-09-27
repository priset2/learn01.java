package learn02;
import java.util.*;
public class Point {
    public  static class point
    {
        private int x;
        private int y;
        point(){};
        point(int x , int y)
        {
            this.x=x;
            this.y=y;
        };
        point (int x)
        {
            this.y=this.x=x;
        }
        point(point p)
        {
            this.x = p.x;
            this.y=p.y;
        }
      void setX(int x)
      {
          this.x=x;
      }
      void setY(int y)
      {
          this.y=y;
      }
      int getX()
      {
          return x;
      }
      int getY()
      {
          return y;
      }


    }
    public static class circle
    {
       private  int x;
        private int y;
       private double r;

       private double square;

       circle(){};
       circle(int x,int y,double r)
       {
           this.x=x;
           this.y=y;
           this.r=r;
      }
      circle(circle c)
      {
          this.x=c.x;
          this.y=c.y;
          this.r=c.r;
      }
      void setX(int x)
      {
          this.x =x;
      }
      void setY(int y)
      {
          this.y=y;
      }
      void setR(double r)
      {
          this.r = r;
      }
       void setSquare()
       {
           this.square=Math.PI*r*r;
       }
        double getSquare()
        {
            return square;
        }
        double getR()
        {
            return  r;
        }
        int getX()
        {
            return this.x;
        }
        int getY()
        {
            return this.y;
        }


    }
    public static void isIn(point p, circle c)
    {
        double distance = Math.abs(p.x-c.x)*Math.abs(p.x-c.x)+Math.abs(p.y-c.y)*Math.abs(p.y-c.y);
        double distance2 = c.r*c.r;

        if(distance2>distance)
        {
            System.out.print(  "Point("+p.x+","+p.y+") is in the Circle(("+c.x+","+c.y+"),"+c.r+")");

        }
        else
        {
            System.out.print(  "Point("+p.x+","+p.y+") is not in the Circle(("+c.x+","+c.y+"),"+c.r+")");
        }


    }


    public  static void main(String[] args)
    {
        circle c = new circle();
        Scanner sc =new Scanner(System.in);
        c.setX(sc.nextInt());
        c.setY(sc.nextInt());
        c.setR(sc.nextDouble());
        c.setSquare();
        point p = new  point(sc.nextInt());
        System.out.print("Area of Circle(("+c.x+","+c.y+"),"+c.r+") is:");
        System.out.printf("%.2f",c.getSquare());
        System.out.println();
        isIn(p,c);

    }

}
