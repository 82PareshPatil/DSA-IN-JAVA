package Array;
import java.util.*;

public class linear_search {
    static int linearsearch(int a[],int k)
    {
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return i;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        int n;
        
     Scanner s=new Scanner(System.in);
     System.out.println("Enter number element:");
     n=s.nextInt();
    
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
        System.out.println("Enter "+i+" Element");
        a[i]=s.nextInt();
     }
     int k;
     System.out.println("Enter A Search Keyword: ");
     k=s.nextInt();
     long st=System.nanoTime();
     int i=linearsearch(a,k);
     if(i==1)
     {
        System.out.println("The Key Not Match:");
     }
     else
     {
        System.out.println("The "+k+" At possition "+i);
     }
     long d=(System.nanoTime()-st)/1000000;
     System.out.println("Time for excution "+d+"ms.");
    }
}
