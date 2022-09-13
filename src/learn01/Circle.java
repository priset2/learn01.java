package learn01;

public class Circle {
    public static class circle
    {

       private String name;
      private  int radius;

      //  boolean cout;
        circle()
        {

        }
        circle (int a ,String b)
        {
            this.radius=a;
            this.name=b;
        }


        void setName(String name1)
        {
            this.name = name1;
        }
        void setRadius(int grade1)
        {
            this.radius  = grade1;
        }

        String getName()
        {
            return name;
        }
        int getRadius()
        {
            return radius;
        }

        Double getC()
        {
            return 2*Math.PI*radius;
        }
       Double getS()
       {
           return Math.PI*radius*radius;
       }




    }

    public static void main(String[] args)
    {

        circle c1 =new circle();

        c1.setRadius(4);

         System.out.println(c1.getS());
    }
 }
