package learn01;
import java.util.*;
public class banji
{

    public static class Student
    {

        String name;
        int grade;

        boolean cout;

            void setName(String name1)
            {
               this.name = name1;
            }
            void setGrade(int grade1)
            {
                this.grade  = grade1;
            }
            void setCout(boolean v)
            {
                this.cout=v;
            }

            String getName()
            {
                return name;
            }
            int getGrade()
            {
                return grade;
            }
             boolean getCout()
             {
                 return cout;
             }




    }

    public static void banji()
    {
       Scanner sc =new Scanner(System.in);
       int number = sc.nextInt();
       Student[]  students =new Student[number];
       for(int i=0;i<number;i++)

       {
           students[i]= new Student();
           students[i].setName(sc.next());
            students[i].setGrade(sc.nextInt());
            students[i].setCout(true);


       }

       for(int i=0;i<number;i++)
       {
           int max =0;
           int which =-1;
           for(int j=0;j<number;j++)
           {
               if(students[j].getCout()&&students[j].getGrade()>max)

               {
                   max=students[j].getGrade();


                 which = j;
               }
           }
           System.out.println(students[which].getName()+"   "+students[which].getGrade());
           students[which].setCout(false);

       }


     }
    public static void main(String [] args)
    {
      banji();
    }


}
