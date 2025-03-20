import java.util.*;
public class prime {
    public static void main(String args[])
    {
        int i,p,n;
        p=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        n=s.nextInt();
        // for(i=2;i<Math.sqrt(n);i++) best case
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                p=1;
            }
        }
        System.out.println(i);
        if(p==0 || n==2)
        {
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
