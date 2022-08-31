package learn01;


public class learn02
{
    public static void main(String[] args)
    {
        int i = 2;
        lable:while(i < 2000)
        {
            int fake = i;
            boolean flag = false;
            while(fake  !=  0)
            {
                if(fake == 1|| fake == 2)
                    flag = true;
                else
                {
                    for(int j = 2;  j< (int)Math.sqrt(fake); j++)
                    {
                        if(fake % j == 0)
                        {
                            i++;
                            continue lable;
                        }
                    }
                }
                fake /= 10;
            }
            if(flag == true)
            {
                System.out.println("i = " + i);
            }
            i++;
        }
    }
}