package Array;
import java.util.*;
public class subarraykadanes {
    static void negativearray(int A[])
    {
        int sum=0,m=Integer.MAX_VALUE;

      for(int i=0;i<A.length;i++)
      {
        if(A[i]<0)
        {
            sum= sum+A[i];
            m=Math.min(sum,m);
        }
      }
      System.out.println("The max sum array is: "+m);
    }
    public static void main(String args[])

    {
        int A[]={-5,-3,5,4,-1,8,-28};
        int B[]={-5,-3,-55,-4,-1,-8,-28};
        int sum=0,m=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            sum= sum<0? sum=0: sum+A[i];
            m=Math.max(sum,m);
        }
        System.out.println("The max sum array is: "+m);
        negativearray(B);
    }
}
