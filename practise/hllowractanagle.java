package practise;
import java.util.*;
public class hllowractanagle
{
   public static void main(String args[])
   {
    int c=5;
    int r=10;
    for (int i=1;i<=c;i++)
    {
        for(int j=1;j<=r;j++)
        {
            if(i==1 || i==c || j==1 || j==r)
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
}