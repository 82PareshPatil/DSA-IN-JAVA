package Array;
import java.util.*;
public class pairs {
    




    static void pairsarray(int A[])
    {
        int tp=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                System.out.print("("+A[i]+","+A[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Iteration: "+tp);
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
     System.out.println("pairs the array ");
     pairsarray(A);

     
    }
}

