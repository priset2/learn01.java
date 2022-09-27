package learn02;

public class Test {
    public static void main(String[]args)
    {
      int  i=1;
       int  j=0;
       int n=6;
       int l=0;
       int k=0;
        while((i+j)<=n) {
            if (i > j) {
                j++;
                l++;
            } else {
                i++;
                k++;
            }
        }
            System.out.println(l+k);

    }
}
