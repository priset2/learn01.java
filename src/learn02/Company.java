package learn02;

import java.util.Scanner;

public class Company {
    public static class Rectangle
    {
        protected  String PoctureCode;
        protected  int  Area;
        protected int Price;
     void setPoctureCode(String a)
     {
         this.PoctureCode=a;
     }
     void setArea(int b)
     {
         this.Area=b;
     }
     void setPrice(int c)
     {
         this.Price=c;
     }
        String getPoctureCode()
        {
            return this.PoctureCode;
        }
        int getArea()
        {
            return this.Area;
        }
        int getPrice()
        {
            return this.Price;
        }



    }
    public static class Client extends Rectangle
    {
        private String ClientCode;
        private String name;
        private String number;
        private  int State;
       Client ()
       {}
        Client (String a,String b,String c,int d,String e,int f,int j)
        {
            this.ClientCode=a;
            this.name=b;
            this.number=c;
            this.State=d;
            this.PoctureCode=e;
            this.Area=f;
            this.Price=j;

        }

        void setClientCode(String a)
        {
            this.ClientCode=a;
        }
        void setName(String b)
        {
            this.name=b;
        }
        void setNumber(String n)
        {
            this.number=n;
        }
        void setState()
        {
            System.out.println("1:预定 2：已交费 3：已完工");
            Scanner sc = new Scanner(System.in);
            int d=sc.nextInt();
            this.State=d;
        }
        void setState(int d)
        {

            this.State=d;
        }
        int getTotalPrice()
        {
            return this.Price*this.Area;
        }

        void outAllInformation()
        {
            System.out.println(this.ClientCode+"\n"+this.name+"\n"+this.number+"\n"+this.State+"\n"+this.PoctureCode+"\n"+this.Area+"\n"+this.Price);
        }




    }


    public static void main(String [] args)
    {
      Client c =new Client();
      c.setClientCode("123456");
      c.setName("test");
      c.setNumber("23242335535");
      c.setState(1);
      c.setArea(10);
      c.setPoctureCode("001");
      c.setClientCode("002");
      c.outAllInformation();
      c.setState();
     System.out.println( c.getTotalPrice());
     c.outAllInformation();

    }

}
