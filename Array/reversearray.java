package Array;
import java.util.*;
public class reversearray {
    static void reverse(int A[])
    {
        int s=0;
        int e=A.length-1;
        while(s<=e)
        {
            int t=A[s];
            A[s]=A[e];
            A[e]=t;
            s++;
            e--;
        }
        for(int i=0;i<A.length;i++)
     {
        System.out.print(A[i]+ " ");
     }
    }
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     int n;
     System.out.println("Enter number of element: ");
     n=s.nextInt();
     int A[]=new int[n];
     for(int i=0;i<A.length;i++)
     {
        System.out.println("Enter of " +i+" Element");
        A[i]=s.nextInt();
     }
     System.out.println();
     for(int i=0;i<A.length;i++)
     {
        System.out.print(A[i]+ " ");
     }
     System.out.println("Reverse the array ");
     reverse(A);

     
    }
}
