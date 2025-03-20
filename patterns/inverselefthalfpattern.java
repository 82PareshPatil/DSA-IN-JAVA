package patterns;

import java.util.Scanner;

public class inverselefthalfpattern {
     public static void main(String args[])
    {
        int n;
        System.out.println("Eneter Any number:");
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
