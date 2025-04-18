package Advance_pattern;
import java.util.*;
public class test {
    static void hr(int r, int c)
    {
          for(int i=1;i<=r;i++)
          {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || i==r || j==1 || j==c)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
    }
    public static void main(String args[])
    {
       int r,c,ch,k=0;
       while (k!=1) {
        
       
       System.out.println("Enter your choise");
       System.out.println("1.Exit");
       System.out.println("2.Hollow_Ractctangle");
       System.out.println("------------------");
       Scanner s=new Scanner(System.in);
       ch=s.nextInt();
       switch(ch)
       {
            case 1: k=1;
            break;
            case 2: {
                System.out.println("Enter number of raws");
                r=s.nextInt();
                System.out.println("Enter the number of colums");
                c=s.nextInt();
                hr(r,c);
            }
       }
    }
       
    }
}
