package learn02;

public class Student3
{
    public static class Course
    {
        protected String name;
        protected int score;





        Course()
        {

        }
        Course(String name,int score)
        {
          this.name=name;
          this.score=score;
        }
        Course(Course c)
        {
            this.score=c.score;
            this.name=c.name;
        }
        void setName(String name)
        {
            this.name=name;
        }
        void setScore(int score)
        {
            this.score=score;
        }
        String getName()
        {
            return this.name;
        }
        int   getScore()
        {
            return score;
        }

    }


    public static class student extends Course
    {

          private  String name;
          private int age;
          private String grade;//年纪
          private  char sex; //性别
         private    int code ;//学号

        protected int ClassNumber;//选课数目


       private  Course[] cou  = new  Course[ClassNumber];//每一个课程类


      student()
      {

      };
      student(int a,String b,char c ,int d)
      {
          this.code=a;
          this.name=b;
          this.sex=c;
          this.age=d;
      }
      student (student s)
      {
          this.age=s.age;
          this.name=s.name;
          this.sex=s.sex;
          this.code=s.code;
      }


        void setName(String name1)
        {
            this.name = name1;
        }
        void setGrade(String grade1)
        {
            this.grade  = grade1;
        }
        void setCode(int grade2)
        {
            this.code  = grade2;
        }

        void setAge(int age ){this.age=age;}

        void setSex(char sex){this.sex=sex;}

       void setClassNumber(int cn)
       {
           this.ClassNumber =cn;
       }


        String getName()
        {
            return name;
        }
        String getGrade()
        {
            return grade;
        }
        int getCode()
        {
            return code;
        }
        char getSex()
        {
            return this.sex;
        }
        int getAge()
        {
            return this.age;
        }
        int getClassNumber(){
          return ClassNumber;
        }

        public String toString()
   {
     return this.grade+","+this.name+","+this.sex+","+this.age;
   }

       public void getHours()
       {
            for(int i=0;i<this.ClassNumber;i++)
            {

            }
       }



    }

    public static class Client
    {

    }
public static void setOut(student s)

{
     System.out.println(s.getGrade()+","+s.getName()+","+s.getSex()+","+s.getAge());
}


    public static void main(String [] args)
    {
     student[] s = new student[2];
     s[0] =new student();
     s[1]=new student();

     s[0].setGrade("007");
     s[0].setSex('m');
     s[0].setName("Bang");
     s[0].setAge(40);

        s[1].setGrade("009");
        s[1].setSex('f');
        s[1].setName("Rose");
        s[1].setAge(41);
        setOut(s[0]);
        setOut(s[1]);
        System.out.println("Student Count: "+s.length);



        System.out.println(s[0].toString());
       System.out.println( s[1].toString());
        System.out.println("Student Count: "+s.length);


    }


}
