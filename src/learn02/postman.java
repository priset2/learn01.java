package learn02;

import java.util.Scanner;

public class postman {
    public static class person
    {
        static Scanner sc =new Scanner(System.in);
        protected String  code;
        protected  String name;

        public person()
        {

        }

        public person(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
    public  static class deliverPerson extends  person
    {
        private String[] area;
        private int number;



        public deliverPerson()
        {
            area = new String[50];
            this.number=50;
        }

        public deliverPerson(int number)
        {
            area = new String[number];
            this.number=number;
        }

        public deliverPerson(String code, String name,int number) {
            super(code, name);
        }


        public String[] getArea() {
            return area;
        }

        public void setArea(String[] area) {
            this.area = area;
        }
        public void setArea() {
          for(int i=0;i<this.number;i++)
          {
              area[i] = "";
              area[i]= sc.next();
          }
        }
        public void setArea(int i,String s) {
         area[i-1]= "";
         area[i-1]=s;
        }
        public boolean isArrived(String area)//用来判断area是否属于该快递员的配送范围；
        {
            int flag =-1;
            for(int i=0;i<this.number;i++)
            {
                if(this.area[i].equals(area))
                {
                    flag=1;
                }
            }
            if(flag==-1)
            {
                return false;
            }
            else

            {
                return true;
            }
        }
        public String toString()  // 用来重写toString()方法，输出该快递员的Id、Name和配送地址等信息。
        {

            String s = "deliveryMan info\n"+"Id:"+this.code+"\n"+"Name:" +this.name+"\n"+"delivery area:";
            for(int i=0;i<this.number;i++)
            {
                s=s+area[i]+",";
            }
            s=s.substring(0,s.length()-1);
            return s;
        }


    }

    public static void test()
    {

        Scanner sc =new Scanner(System.in);
        deliverPerson dp =new deliverPerson(5);
        dp.setName("Bang");
        dp.setCode("007");
      for(int i=1;i<=5;i++)
      {
          String s= "area"+i;
          dp.setArea(i,s);
      }
        System.out.println(dp.toString()+"\n");
      System.out.println("input area name:");
     boolean b= dp.isArrived(sc.next());
      if(b)
      {
          System.out.println("yes");
      }
      else
      {
          System.out.println("sorry");
      }

    }

    public static void main(String [] args)
    {
                    test();
    }
}
