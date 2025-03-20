import java.util.Scanner;

public class evenoddsum {
    public static void main(String args[])
    {
        int n,c;
        int e=0;
        int o=0;
        do
        {
           System.out.println("Enter any number:");
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           if(n%2==0)
           {
            e+=n;
           }
           else{
            o+=n;
        
           }
           System.out.println("Enter 1 continue");
           c=s.nextInt();
        }
        while(c==1);
        System.out.println("Sum of even numbers: " + e);
        System.out.println("Sum of odd numbers: " + o);
    }
}
