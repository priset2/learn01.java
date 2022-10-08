package learn02;

public class Test2 {
    public  class Student
    {
        private String no;
        private String name;
        private char sex ;
        private int age;
        private static int count;
        public static void setcount(int count1)
        {
            count=count1;
        }
        public static int getcount()
        {
            return count;
        }
        public Student()
        {
            count++;
        }
        public Student(String no,String name,char sex,int age)
        {
            this.no=no;
            this.name=name;
            this.sex=sex;
            this.age=age;
            count++;
        }
        public String getno()
        {
            return no;
        }
        public void setno(String no)
        {
            this.no=no;
        }
        public String getname()
        {
            return name;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public char getsex()
        {
            return sex;
        }
        public void setsex(char sex)
        {
            this.sex=sex;
        }
        public int getage()
        {
            return age;
        }
        public void setage(int age)
        {
            this.age=age;
        }
        public String toString()
        {
            return no+","+name+","+sex+","+age+"/n";
        }
    }
    public void main(String[] args)
    {
        Student stu1= new Student();
    }
}
