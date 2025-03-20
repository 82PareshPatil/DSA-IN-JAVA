package Array;
import java.util.*;
public class DSA_Watertraapping {
    static void Water_trapping(int A[],int n,int width)
    {
    //   max left
    int lm[]=new int[n];
    lm[0]=A[0];
    for(int i=1;i<n;i++) 
    {
        lm[i]=Math.max(lm[i-1], A[i]);
    }
    // max right
    int rm[]=new int[n];
    rm[n-1]=A[n-1];
    for(int i=n-2;i>=0;i--)
    {
        rm[i]=Math.max(A[i], rm[i+1]);
    }
    int t=0;
    // loop
    for(int i=0;i<n;i++)
    {
        // minimum of leftmax and right max
         int w=Math.min(lm[i] ,rm[i]);
         
         // total trapping water sum
         t=(t+(w-A[i]))*width;

    }
      System.out.println("The Sum of Water Trapped is: "+t);
    }
    public static void main(String args[])
    {
        int width=1;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter number of array Element: ");
       int n=s.nextInt();
       int A[]=new int[n];
       for(int i=0;i<n;i++)
       {
       System.out.println("Enter A "+i+" Element");
       A[i]=s.nextInt();
       }
       Water_trapping(A,n,width);
    }
}