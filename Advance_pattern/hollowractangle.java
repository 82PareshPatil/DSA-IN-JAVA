package Advance_pattern;
import java.util.*;
public class hollowractangle {
    static void hr(int r,int c)
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
    static void hrt(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    static void rhrt(int n)
    {
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    static void t(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    static void rt(int n)
    {
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }

    static void d(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }

    static void b(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        
        System.out.println();
       }
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    static void lrnht(int n)
    {
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
       }
    }
    static void lcnht(int n)
    {
        int j,c=1;
        for(int i=1;i<=n;i++)
       {
        for(j=1;j<=i;j++)
        {
            System.out.print(c);
            c++;
        }
       
        System.out.println();
       }
    }

    static void bhlt(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void r(int r)
    {      
       for(int i=r;i>=1;i--)
       {
        for(int j=1;j<=i-1;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=r;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
    }

    static void rltbam(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=(n-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void hr(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++)
            {
                if(i==1 || i==r || j==1 || j==r)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pl(int n)
    {
      
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("   ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+"  ");
               
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r,c,ch,p=0;
        while (p!=1) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1.Exit");
        System.out.println("2.Hollow Ractangle");
        System.out.println("3.Hlaf right triangle");
        System.out.println("4.Reverse Hlaf right triangle");
        System.out.println("5.triangle");
        System.out.println("6.Reverse triangle");
        System.out.println("7.Dimond");
        System.out.println("8.Butter Fly");
        System.out.println("9.left Reverse number half triangle.");
        System.out.println("10.left continue number half triangle.");
        System.out.println("11.Binary left number half triangle.");
        System.out.println("12.Rohumbus");
        System.out.println("13.Reverse half left triangle by another method");
        System.out.println("14.Hollow Rohumbus");
        System.out.println("15.Palindromic");
        System.out.println("Enter Your choise:");
        ch=s.nextInt();
        switch (ch) {
            case 1:p=1;
            break;
            case 2:System.out.println("Enter number of raw: ");
            r=s.nextInt();
            System.out.println("Enter number of columan: ");
            c=s.nextInt();
            hr(r,c);
                break;
            case 3:System.out.println("Enter number of raw: ");
            r=s.nextInt();
            hrt(r);
            break;
            case 4:System.out.println("Enter number of raw: ");
            r=s.nextInt();
            rhrt(r);
            break;
            case 5:System.out.println("Enter number of raw: ");
            r=s.nextInt();
             t(r);
            break;
            case 6:System.out.println("Enter number of raw: ");
            r=s.nextInt();
             rt(r);
            break;
            case 7:System.out.println("Enter number of raw: ");
            r=s.nextInt();
             d(r);
            break;
            case 8:System.out.println("Enter number of raw: ");
            r=s.nextInt();
             b(r);
             break;
             case 9: System.out.println("Enter number of raw: ");
             r=s.nextInt();
             lrnht(r);
             break;
             case 10: System.out.println("Enter number of raw: ");
             r=s.nextInt();
             lcnht(r);
             break;
             case 11:System.out.println("Enter number of raw: ");
             r=s.nextInt();
             bhlt(r);
             break;
             case 12:System.out.println("Enter number of raw: ");
             r=s.nextInt();
             r(r);
             break;
             case 13:System.out.println("Enter number of raw: ");
             r=s.nextInt();
             rltbam(r);
             break;
             case 14:System.out.println("Enter number of raw: ");
             r=s.nextInt();
             hr(r);
             break;
             case 15:System.out.println("Enter number of raw: ");
             r=s.nextInt();
             pl(r);
             break;
            default:System.out.println("Wrong Choise...");
                break;
        }
        }
        
    }
}
