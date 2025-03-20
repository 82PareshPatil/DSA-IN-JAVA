package practise;
import java.util.*;
public class binrysearch {
     static int bs(int A[],int k)
    {
       int st=0;
       int e=A.length-1;
       while(st<=e)
       {
        int m=(st+e/2);
        if(A[m]==k)
       {
           return m;
       }
       else if(A[m]>=k)
       {
          e=m-1;
       }
       else{
        e=m+1;
       }
       }
       return 1;
    }
    public static void main(String args[])
    {
         int A[]={2,3,4,5,6,7,8,9};
        System.out.println("Enter a key");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int r=bs(A,k);
        if(r==1)
        {
            System.out.println("Key not find");
        }
        else{
            System.out.println(k+" at posstion of "+r);
        }
    }
}
