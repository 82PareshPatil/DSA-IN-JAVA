import java.util.*;
import java.lang.*;
public class arrycreation
{
    public static void main(String[] args) {
         int a[]=new int[10];
         Scanner s=new Scanner(System.in);
         for(int i=0;i<10;i++)
         {
            System.out.print("Enter A number");
            a[i]=s.nextInt();
         }
         for(int i=0;i<10;i++)
         {
           System.out.println((i+1)+":"+a[i]);                  
         }
        
    }
}