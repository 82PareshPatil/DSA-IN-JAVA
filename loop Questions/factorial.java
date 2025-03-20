import java.util.*;
public class factorial {
   public static void main(String args[])
   {
     int n,i;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Any number");
     n=s.nextInt();
     for(i=n-1;i>1;i--) 
    
     {
        n=n*i;
     }
     System.out.println("the factorial of n is: "+n);
   }
}
