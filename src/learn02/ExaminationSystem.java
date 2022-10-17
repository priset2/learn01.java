/**
 * @author WangNachuan
 *
 * @since  20221009
 */
package learn02;


import java.util.Locale;
import java.util.Scanner;

public class ExaminationSystem {
  static  Scanner sc = new Scanner(System.in);
    public static class Question
    {
        protected  String text;
        protected  String options;

        public Question(){};
        public Question(String text, String options) {
            this.text = text;
            this.options = options;
        }
       public  Boolean check(String answers)
        {
            return true;

        }
        public void print()
        {
             System.out.println(this.text);
             System.out.println(this.options);
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getOptions() {
            return options;
        }

        public void setOptions(String options) {
            this.options = options;
        }
    }

    public static class SingleQuestion extends  Question
    {
        private char answer;

        SingleQuestion()
        {

        }
        public SingleQuestion(char answer) {
            this.answer = answer;
        }

        public SingleQuestion(String text, String options, char answer) {
            super(text, options);
            this.answer = answer;
        }
        public Boolean check(String answers)
        {
            char answer = answers.charAt(0);
            if(this.answer==answer)
            {
                return  true;
            }
            else
            {
                return false;
            }
        }

        public char getAnswer() {
            return answer;
        }

        public void setAnswer(char answer) {
            this.answer = answer;
        }
    }

    public  static class MultiQuestion extends  Question
    {
        private  String answers;

        public MultiQuestion(String answers) {
            this.answers = answers;
        }

        public MultiQuestion(String text, String options, String answers) {
            super(text, options);
            this.answers = answers;
        }

        public MultiQuestion() {

        }

        public String getAnswers() {
            return answers;
        }

        public void setAnswers(String answers) {
            this.answers = answers;
        }

        public Boolean check(String answers)
        {
            if(this.answers.length()!=answers.length())
            {
                return false;
            }
            else
            {
                int flag2=0;

               for(int i=0;i<this.answers.length();i++)
               {
                   int flag =0;
                   for(int j=0;j<answers.length();j++)
                   {
                           if(this.answers.charAt(i)==answers.charAt(j))
                           {
                               flag =1;
                           }
                   }
                   if(flag ==1)
                   {
                       flag2=1;
                   }
               }

                if(flag2==1)
                {
                    return true;
                }
                else
                {
                     return false;
                }
            }

        }


        public void print()
        {
            System.out.println(this.text);
            System.out.println(this.options);
        }

    }
public static void output(Boolean b) {
    if (b)
    {
        System.out.println("OK");
    }
    else
    {
        System.out.println("NO");
    }
}
public static void question1()
{

  Question  q2 = new MultiQuestion("Characteristics of object-oriented program design is ","A.package      B.derive         C.polymorphism  D.Static","abc");
    q2.print();

  String answers;


  System.out.print("Please choose:");
  answers = sc.nextLine();
  if(answers.length()==0)
  {
      System.out.print("NO");
  }
  else {
      answers.toUpperCase();
      output(q2.check(answers));
  }

}

public static void question2()
{
    Question q1  =new SingleQuestion("Default value of int type is","A.0    B.1     C.2     D.3",'A');
     String answers;
    char answer;
       q1.print();

    System.out.print("Please choose:");
     answers=sc.nextLine();
     if(answers.length()!=1)
     {
         System.out.print("NO");
     }
   else {
       answers=answers.toUpperCase();
       answer=answers.charAt(0);

         output(q1.check(String.valueOf(answer)));
     }

}
    public static void main(String [] args)
    {
           question1();
           System.out.println();
           question2();
    }

}
