/*
 * 名称：猜数字小游戏作业
 *
 * 姓名：王纳川
 *
 * 时间：22021007
 */
package learn02;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class CaseNumber {



    public static class Number
    {
      static   Scanner sc = new Scanner(System.in);
       private String number1;//计算机生成数字
       private String number2;//玩家输入数字
       protected int a;//完全正确的数字
       protected int b;//数字正确但是位置不正确

        private int cycleNumber ;

        public void setNumber1() {
            Random r = new Random();
            int  a  = r.nextInt(8999)+1000;
            this.number1= String.valueOf(a);
        }
        public String getNumber1()
        {return this.number1;}

        public  void setNumber2(int a)
        {
            this.number2=String.valueOf(a);
        }
        public String getNumber2()
        {
           return    this.number2;
        }
        public void setCycleNumber(int x)
        {
            this.cycleNumber=x;
        }
        public int getCycleNumber()
        {
            return this.cycleNumber;
        }
        public  void panduan(String ch)
        {
            this.a=this.b=0;
             for(int i=0;i<4;i++)
             {
                 if (ch.charAt(i)==number1.charAt(i))
                 {
                     this.a++;
                 }
                 else
                 {
                     for(int j=0;j<4;j++)
                     {
                         if (ch.charAt(i)==number1.charAt(j))
                         {
                             b++;
                         }
                     }
                 }
             }
        }


    }
    public static class Gamer extends Number
    {
        private String name;
        private int chengji;

        public void setChengji(int chengji) {
            this.chengji = chengji;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getChengji() {
            return chengji;
        }

        public void Game()
        {
            int cishu =0;
            int flag=-1;
            System.out.println("请输入循环次数");
            this.setCycleNumber(sc.nextInt());
            super.setNumber1();
            for(int i=0;i<super.getCycleNumber();i++)
            {

                System.out.println(this.getNumber1());//测试用
                System.out.println("请输入猜测的数字");
                setNumber2(sc.nextInt());
                super.panduan(super.getNumber2());
                System.out.println(this.a+"A "+this.b+"B ");
                cishu++;
                if(a==4&&b==0)
                {
                    System.out.println("成功猜中，游戏胜利");
                    flag=1;
                    this.setChengji(cishu);
                    break;
                }

            }
            if(flag==-1)
            {
                this.setChengji(super.getCycleNumber());
                System.out.println("游戏失败");

            }
        }
    }
//    public static class  Root  extends Number
//    {
//        public void root()
//        {
//            System.out.println(super.getNumber1());
//        }
//    }
  public static class  RankingList   extends Gamer
{
    private  String gamerPath;
    private String[] s;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RankingList(){}
    public RankingList(String gamerPath) {
        this.gamerPath = gamerPath;
    }

    public String getGamerPath() {
        return gamerPath;
    }

    public void setGamerPath(String gamerPath) {

    }



    public void setS(Gamer g,int i,String n,int chengji) {

      //this.setName(n);
         s[i]= new String();
       s[i]= n+ " "+ chengji ;

    }

    public void setGamerPath()  {
        this.gamerPath = super.getName() + " " + super.getChengji();

    }
        public void totalGame()
        {
            System.out.println("请输入玩家人数");
            this.setNumber(sc.nextInt());
            this.s = new String[number];
            for(int i=0;i<this.number;i++)
            {
                System.out.println("请输入玩家"+(i+1)+"的姓名");
                String name = sc.next();
                Gamer g1 =new Gamer();
                g1.Game();

                setS(g1,i,name,g1.getChengji());

            }

            this.getS();

        }
    public void getS()
    {
        for(int i=0;i<this.number;i++)
        {
            System.out.println("玩家"+(i+1)+":    "+s[i]);
        }
    }

//        //读写文件
//        File file = new File("ranking.txt");
//        InputStreamReader reader = new InputStreamReader( new FileInputStream("ranking.txt"));
//        BufferedReader br = new BufferedReader(reader);
//        String line ="";
//        while(line!=null)
//        {
//            line = br.readLine();
//            System.out.println(line);
//        }
//
//
//        //写文件
//
//
//        File writename = new File("ranking.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
//        writename.createNewFile(); // 创建新文件
//        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
//
//        out.flush(); // 把缓存区内容压入文件
//        out.close(); // 最后记得关闭文件


    }


    public static void main(String [] args)
    {


        RankingList r = new RankingList();
        r.totalGame();

    }

}
