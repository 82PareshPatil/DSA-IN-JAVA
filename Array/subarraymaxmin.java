package Array;
import java.util.*;
public class subarraymaxmin {
    static int max(int A[])
    {
        int min=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
             if(A[i]>min)
             {
                 min=A[i];
             }
        }
        return min;
    }
    static int min(int A[])
    {
        int max=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
             if(A[i]<max)
             {
                 max=A[i];
             }
        }
        return max;
    }
    static void subarraysum(int A[])
    {
        int m,n;
        n=Integer.MIN_VALUE;
        for(int i=0;i<=A.length;i++)
        {
            for(int j=i;j<=A.length;j++)
        {
            int sum=0,k;
            for(k=i;k<j;k++)
            {  
                sum+=A[k];
            }
            if(sum<n)
            {
                sum=n;
            }
           
            System.out.println("("+sum+") ");
        }
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        int A[]={2,4,6,8,10};
        subarraysum(A);
        
    }
}
