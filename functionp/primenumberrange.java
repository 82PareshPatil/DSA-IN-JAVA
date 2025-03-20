package functionp;
import java.util.*;
public class primenumberrange {
    static int prime(int n)
    {
        int p=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
             p=1;
            }
        }
        if(p==0 || n==2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
   static void primerange(int k)
   {
    for(int i=2;i<k;i++)
    {
           if(prime(i)==1)
           {
            System.out.println(i);
           }
    }
   }
    public static void main(String args[])
    {
        int n,k,ch,p=0;
        Scanner s=new Scanner(System.in);
        while(p!=1)
        {
            System.out.println("-------------------------------------------");
        System.out.println("1.Chack Number Prime Or Not");
        System.out.println("2.prime nummber in range");
        System.out.println("3.Exit");
        System.out.println("Enter Your Choise: ");
        ch=s.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Enter Any prime number:");
             n=s.nextInt();
             if(prime(n)==1)
             {
                System.out.println(n+" is prime");
             }
             else
             {
                System.out.println(n+" is not a prime");
             };
                break;

            case 2: 
            System.out.println("Enter Any range number:");
            k=s.nextInt();
             primerange(k);
                break;
            case 3: p=1;
            break;
            default:System.out.println("Wrong choise...");
                break;
        }
    }
       
    }
}