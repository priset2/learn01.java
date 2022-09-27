package learn02;

import java.util.Scanner;

public class huapu {
    public static class area
    {
        private int  length;
        private int wideth;
        private int price;
        private int sum_price;
        public void setPrice(int a)
        {
            this.price=a;
        }
        public void setLength(int a)
        {
            this.length=a;

        }
        public void setWideth(int a)
        {
            this.wideth=a;
        }
        public void setSum_price()
        {
            this.sum_price=this.wideth*this.length*this.price;
        }
        public int getPrice()
        {
            return this.price;
        }
        public int getLength()
        {
            return this.length;
        }
        public int getWideth()
        {
            return this.wideth;
        }
        public int getSum_price()
        {
            return this.sum_price;
        }
        public String  toString()
        {

            return  "花坛的长为："+this.length+"    宽为："+this.wideth+"     单价为:"+this.price+"  总价为："+this.sum_price;

        }



    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
       area[]  ar= new area[5];
       for(int i=0;i<5;i++)
       {
           ar[i]= new area();
        ar[i].setLength(i+1);
        ar[i].setWideth(i+2);
        ar[i].setPrice(sc.nextInt());
           ar[i].setSum_price();
       }
       int sumprice =0;
      for(int i=0;i<5;i++)

      {
          sumprice+=ar[i].getSum_price();
          System.out.println(ar[i].toString());
      }
        System.out.println("全部花坛总价格为： "+sumprice);
    }

}
