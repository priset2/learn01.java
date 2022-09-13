package learn02;

public class Student2
{

    public static class student
    {

      private  String name;
       private int grade;

     private    int code ;

      student()
      {};
      student(int a,int b ,String c)
      {
          this.code=a;
          this.grade=b;
          this.name=c;
      }

        void setName(String name1)
        {
            this.name = name1;
        }
        void setGrade(int grade1)
        {
            this.grade  = grade1;
        }
        void setCode(int grade2)
        {
            this.code  = grade2;
        }

        String getName()
        {
            return name;
        }
        int getGrade()
        {
            return grade;
        }
        int getCode()
        {
            return code;
        }





    }



    public static void main(String [] args)
    {
        student s1 = new student();

    }


}
