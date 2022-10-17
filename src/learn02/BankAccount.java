package learn02;

import java.text.DecimalFormat;
import java.util.Scanner;



public class BankAccount {

    public static class Account
    {
        protected String idCard;
        protected  double balance;


        public Account()
        {

        }
        public Account(String idCard, double balance) {
            this.idCard = idCard;
            this.balance = balance;
        }

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

    }
    public static  class BankingAccount  extends Account
    {
        private  int days;
        private   double rate ;

        private double interest;

        public BankingAccount(){}
        public BankingAccount(int days, double rate) {
            this.days = days;
            this.rate = rate;
        }

        public BankingAccount(String idCard, double balance, int days, double rate) {
            super(idCard, balance);
            this.days = days;
            this.rate = rate;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }
        public double getInterest()
        {
         double interest = this.balance*this.rate*this.days/365;
         this.interest=interest;
         return interest;
        }
        public String toString()
        {
            DecimalFormat df = new DecimalFormat("#.00");

            String s = "account:"+this.idCard+" balance:"+df.format(this.balance)+" days:"+this.days+" interest:"+df.format(this.interest)+" (rate:"+df.format(this.rate*100)+"%)";
            return s;
        }
    }
    public static  class FixdDepositAccount  extends  Account
    {
        private  int months;
        private  double rate;

        private double interest;

        public FixdDepositAccount(int months, double rate) {
            this.months = months;
            this.rate = rate;
        }

        public FixdDepositAccount(String idCard, double balance, int months, double rate) {
            super(idCard, balance);
            this.months = months;
            this.rate = rate;
        }

        public FixdDepositAccount() {

        }

        public int getMonths() {
            return months;
        }

        public void setMonths(int months) {
            this.months = months;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }
        public double getInterest()
        {
             double interest = this.balance*this.rate*this.months/12;
             this.interest=interest;
             return interest;
        }
        public String toString ()
        {
            DecimalFormat df = new DecimalFormat("#.00");
           String s = "account:"+this.idCard+" balance:"+df.format(this.balance)+" months:"+this.months+" interest:"+df.format(this.interest)+" (rate:"+df.format(this.rate*100)+"%)";
           return s;
        }

    }
    static  Scanner sc = new Scanner(System.in);
    public static  void test()
    {


         /*D:001

Balance:100000

Months:36

Rate:0.035

ID:002

Balance:100000

Days:182

Rate:0.052

          */

        BankingAccount ba = new BankingAccount();
        FixdDepositAccount fa = new FixdDepositAccount();

        System.out.print("ID:");
        fa.setIdCard(sc.next());
        System.out.print("Balance:");
        fa.setBalance(sc.nextDouble());
        System.out.print("Months:");
        fa.setMonths(sc.nextInt());
        System.out.print("Rate:");
        fa.setRate(sc.nextDouble());
        fa.getInterest();

        System.out.println(fa.toString());

        System.out.print("ID:");
        ba.setIdCard(sc.next());
        System.out.print("Balance:");
        ba.setBalance(sc.nextDouble());
        System.out.print("Days:");
        ba.setDays(sc.nextInt());
        System.out.print("Rate:");
        ba.setRate(sc.nextDouble());
        ba.getInterest();





        System.out.println(ba.toString());


    }
    public static  void  main(String [] args)
    {
       test();
    }
}
