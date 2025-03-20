package practise;

public class lastdigitnum {
    public static void main(String args[])
    {
        int k=56988751;
        // int num=k / 10;
        // System.out.println(num);
   int l=0;
       while(k>0)
       {
        int n=k%10;
          l=n/10;
       }
       System.out.println(l);
    }
}
