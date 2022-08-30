package learn01;

public class learn02 {
    public  static int Sushu(int a)
    {
             for(int i=1;i<a/2;i++)
             {
                 if(a%i==0)
                 {
                   return 0;

                 }
             }
             return 1;
    }
   public static int  SuperSushu(int a)
   {

       int x =0;
       int target = Sushu(a);
       if(a==1)
       {
           a/=10;
           x++;
          return  SuperSushu(a);

       }
       else
       {
           return x;
       }

   }
   public static  void Super(int a,int x)
   {
       if(a>1&&a<100)
       {
           if(x==2)
           {
               System.out.println(a);
           }
       }
       else if (a>100&&a<1000)
       {
           if(x==3)
           {
               System.out.println(a);
           }
       }
       else
       {
           if(x==4)
           {
               System.out.println(a);
           }
       }
   }


    public static void main(String [] args)
    {
         for(int i=1;i<2000;i++)
         {
             int x =SuperSushu(i);
             Super(i,x);
         }
    }

}
