package learn01;
import java.util.*;

import java.util.Scanner;
public class Race {
    public static void race()
    {
        int number =0;
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        double number2 =number;
        int [] score = new int[number];
        for(int i=0;i<number ;i++)
        {
            score[i]=sc.nextInt();

        }
        Arrays.sort(score);
        int sum=0;
        for(int i=2;i<number-2;i++)
        {
            sum+=score[i];
        }
        double average = sum / (number2 - 4);
        System.out.printf("%.2f",average);


    }

    public static void main (String [] args)
    {

    race();
    }


}
