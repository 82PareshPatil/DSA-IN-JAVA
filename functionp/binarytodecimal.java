package functionp;
import java.util.*;
public class binarytodecimal {
    static int btd(int n)
    {
       int d=0;
       int p=0;
       int l;
       while(n>0)
       {
        l=n%10;
        d=d+(l*(int)Math.pow(2, p));
        p++;
        n=n/10;
       }
       return d;
    }
    static int dtb(int n)
    {
        int b=0,p=0,r;
        while (n>0) {
            
                r=n%2;
            b=b+(r*(int)Math.pow(10, p));
            p++;
            n=n/2;            
        }
        return b;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=0,ch,n;
        while(p!=1){
         System.out.println("-----------------------------------------");
         System.out.println("1.Exit");
         System.out.println("2.Convert Number Binary to Decimal");
         System.out.println("3.Convert Number Decimal to Binary");
         System.out.println("Enter Your Choise.");
         ch=s.nextInt();
         switch (ch) {
            case 1:p=1;
            break;
            case 2:
                    System.out.println("Enter Binary Number:");
                   n=s.nextInt();
                   System.out.println("The Decimal of "+n+" is: "+btd(n));
                break;
            case 3:System.out.println("Enter Decimal Number:");
                n=s.nextInt();
                System.out.println("The Decimal of "+n+" is: "+dtb(n));
                break;
            default: System.out.println("Wrong Choise...");
                break;
         }
    }
    }
}
