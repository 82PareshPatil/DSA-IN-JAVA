package Array;
import java.util.*;

public class subarrysum {
    public static void main(String args[])
    {
        int o=Integer.MAX_VALUE;
        int n=Integer.MIN_VALUE;
        int A[]={2,4,6,8,10};
      for(int i=0;i<=A.length;i++)
      {
        for(int j=i;j<A.length;j++)
        {
            int sum=0;
            for(int k=i;k<=j;k++)
            {
               sum+=A[k];
            }
            System.out.println("The Sum of Subarray is: ("+sum+")");
            if(sum>n)
            {
                n=sum;
            }
            if(sum<o)
            {
                o=sum;
            }
        }
        
        
        
        System.out.println();
      }
      
      System.out.println("The max subarray sum is: "+n);
      System.out.println("The min subarray sum is: "+o);
    }
}
