package learn01;

public class LoveNumber {
    public static int YinZi(int a)
    {
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                //System.out.println(i);
                sum+=i;
            }
        }
      //  System.out.println(sum);
        return sum;
    }
    public  static int LoveNember(int a,int b)
    {
        int a2=YinZi(a);
        int b2 =YinZi(b);
        if(a2==b&&b2==a&&a!=b)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
public static void Run()
{
    for(int i=1;i<=2000;i++)
    {
        for(int j=2000;j>i;j--)
        {
            if(LoveNember(i,j)==1)
            {
                System.out.println(i+" "+j);
            }
        }
    }
}
    public static void main(String [] args)
    {
      //System.out.println( LoveNember(220,284));
        Run();
    }

}
