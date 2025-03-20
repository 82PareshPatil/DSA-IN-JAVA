
package patterns;
import java.util.*;
public class lefthalfpatterns {
    public static void main(String args[])
    {
        int n;
        char ch='A';
        System.out.println("Eneter Any number:");
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch++);
            
        }
        System.out.println();
       }
    }
}
