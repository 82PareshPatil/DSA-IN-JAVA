package Array;
import java.util.*;
public class binary_search {
    static int binarysearch(int A[],int k)
    {
        int st=0;
        int e=A.length-1;
   while (st<=e) 
    {
        int m=(st+e)/2;
       if(A[m]==k)
       {
             return m;
       }
       else if(A[m]>k)
       {
        e=m-1;
       }
       else
       {
        st=m+1;
       }
       
    }  
    return -1;
    }

    
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int A[]={2,3,4,5,6,7,8,9};
    System.out.println("Enter A key:");
   int k=s.nextInt();
   int r=binarysearch(A,k);
   if(r==-1)
   {
    System.out.println("key not match...");
   }
   else{
    System.out.println("the "+k+" at posstion of "+r);
   }
}
}
