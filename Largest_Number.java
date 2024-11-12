import java.util.*;
public class Largest_Number {
    public static void MaxNumber(int a[])
    {
        int i,m=0;
       int k=Integer.MIN_VALUE;
       for(i=0;i<a.length;i++)
       {
        if(k<a[i])
        {
            k=a[i];
            m=i;
        }
       }
       System.out.println("The Maximum Number In Your Data Is, "+k+" At Inndex "+m);
    }
    public static void MinNumber(int a[])
    {
        int i,m=0;
        int k=Integer.MAX_VALUE;
        for(i=0;i<a.length;i++)
        {
         if(k>a[i])
         {
             k=a[i];
             m=i;
         }
        }
        System.out.println("The Minimum Number In Your Data Is, "+k+" At Inndex "+m);
    }
    public static void main(String args[])
    {
      int a[]=new int[10];
      Scanner s=new Scanner(System.in);
      for(int i=0;i<a.length;i++)
      {
        System.out.println("Enter A "+i+" Number");
        a[i]=s.nextInt();
      }
      MaxNumber(a);
      MinNumber(a);
    }
}
