package learn01;
import java.util.Scanner;

public class MiniPoint
{
    public static void main (String[] args)
    {
        Scanner scan=new Scanner (System.in);
        int[][] array=new int[100][100];
        int m=scan.nextInt();
        int n=scan.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=scan.nextInt();
            }
        }
        scan.close();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int t=0;

                for(int p=0;p<m;p++)
                {
                    if(array[i][j]>array[p][j])
                    {
                        t+=1;
                    }
                }
                for(int q=0;q<n;q++)
                {
                    if(array[i][j]>array[i][q])
                    {
                        t+=1;
                    }
                }

                if(t==0)
                {
                    System.out.printf("%d ",array[i][j]);
                    System.out.printf("%d ",i+1);
                    System.out.printf("%d\n",j+1);
                }
            }
        }
    }
}