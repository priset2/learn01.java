package learn02;

public class Test
{
    public  static class base {
        protected void step1(){}
        protected  void  step2()
        {}
       public void action()
       {
           int number = 1;
           step1();
           number =2;
           step2();
       }


    }
    public static   class children extends base
    {


    }


    public static void main(String [] args)
    {

    }

}
