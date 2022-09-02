package learn01;
import java.util.Random;
import java.util.Scanner;
public  class Captcha {

    public static void code()
    {
        char [] code = new  char []{'3', '4','5', '6', '7', '8', 'a', 'b' ,'c', 'd','e','f','h','i','j','k','m','n','p','q','r','s',
                't', 'u', 'V' ,'W', 'x','v','A','B' ,'C','D','E','F','G','H','I','J','K','M','N','P','Q','R','S','T','U','V','W','X','Y'};
        Boolean [] flag = new Boolean[code.length];
       for(int i=0;i<code.length;i++)
       {
           flag[i]= true;
       }
        Random r =new Random();

        for(int i=0;i<4;i++)
        {
            int target = r.nextInt(50);
            if(flag[target ])
            {
                System.out.print(code[target]);
                flag[target] = false;
            }
         
        }

    }


    public static void test()
    {
        System.out.println("请输出希望生成的验证码个数");
        Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       for(int i=0;i<a;i++)
       {
           code();
           System.out.println();
       }
    }
    public static void main(String [] args)
    {
        test();
    }

}
