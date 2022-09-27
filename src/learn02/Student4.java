package learn02;

import java.util.Scanner;

public class Student4 {

    public static  class lesson
    {
        private  static String name;
        private static int time;





       public void setName(String a)
       {
           name=a;
       }
        public  void setTime(int a)
        {
            time=a;
        }
        String getName()
        {
            return name;
        }
        int getTime ()
        {
            return time;
        }



    }

    public   static class student extends  lesson
    {
        private String StudentName;
        private int grade;

        private int lessonNumber;

       lesson[] le ;

        private int sumTime;
        student()
        {


        }
        student (String name , int grade, int lessonNumber)
        {
            this.lessonNumber=lessonNumber;
              le = new lesson[this.lessonNumber];
               this.StudentName=name;
               this.grade=grade;

              this.setLesson();
        }


           public void setSumTime()
        {
            this.sumTime=createSumTime();
        }

        public int getSumTime()
        {
            return  this.sumTime;
        }


        public void setLessonNumber(int a)
        {
            this.lessonNumber=a;
        }

        public void setLesson()
        {
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<this.lessonNumber;i++)
            {
                 le[i]=new lesson();
                 System.out.print("input no "+(i+1)+" course name:");
                 le[i].setName(sc.next());
                 System.out.print("input no "+(i+1)+" course hour:");
                 le[i].setTime(sc.nextInt());
            }
        }
        public String  getLesson()
        {
            String b = null;

            for(int i=0;i<this.lessonNumber;i++)
            {
                b+="courses："+"\n"+"("+(i+1)+")"+le[i].getName()+":"+le[i].getTime()+"hour"+"\n";
                 System.out.println( "courses："+"\n"+"("+(i+1)+")"+le[i].getName()+":"+le[i].getTime()+"hour"+"\n");
            }

            return b;
        }
        
       private   int createSumTime()
       {
           int sumTime=0;
           for(int i=0;i<this.lessonNumber;i++)
           {
               sumTime+=le[i].getTime();
           }
           return sumTime;
       }



        public void setStudentName(String a)
        {
            this.StudentName=a;
        }
        public  void setGrade(int a)
        {
            this.grade=a;
        }
        String getStudentName()
        {
            return this.StudentName;
        }
        int getGrade ()
        {
            return this.grade;
        }
        int getLessonNumber()

        {
            return this.lessonNumber;
        }

    }
    public static class client  extends  student
    {
        private  int  studetNumber;

        client(){}
        client(int a)
        {
            this.setStudetNumber(a);
        }


        void setStudetNumber(int a)
        {
            this.studetNumber=a;
        }
        int getStudetNumber()
        {
            return  this.studetNumber;
        }


        Scanner sc2 =new Scanner(System.in);
       public  void setStudent()
        {

            System.out.print("input student count:");
            this.studetNumber = sc2.nextInt();

            student [] st= new student[studetNumber];
            for(int i=0;i<this.studetNumber;i++)
            {

                System.out.print("input no "+(i+1)+" student name:");
                String a = sc2.next();
                System.out.print("input no "+(i+1)+" student grade:");
                int b = sc2.nextInt();
                System.out.print("input no "+(i+1)+" student course count:");
                int c  = sc2.nextInt();
                st[i]= new student(a,b,c);
            }
        }
        public void  showStudent()
        {
            for(int i=0;i<this.studetNumber;i++)
            {
                System.out.println("no "+(i+1)+" student information:");
                System.out.println(this.getStudentName() +" "+this.getGrade()+" grade");
               // System.out.println();
               this.getLesson();

            }
        }


    }
    public static   void test()
    {

         client c = new client();
         c.setStudent();
         c.showStudent();

    }

    public  static void main(String [] args)
    {
       test();
    }

 }
