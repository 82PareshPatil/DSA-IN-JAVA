package Array;


import java.util.*;

public class largest_number {
    static int largest(int a[])
    {
        int  l=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(l<a[i])
            {
                l=a[i];
                
            }
        }
        return l;
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
     
     long st=System.nanoTime();
     int i=largest(a);
     
     
        System.out.println("The Largest number in giiven array is: "+i);
     
     long d=(System.nanoTime()-st)/1000000;
     System.out.println("Time for excution "+d+"ms.");
    }
}

