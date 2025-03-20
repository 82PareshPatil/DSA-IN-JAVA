import java.util.*;
class reverse
{
    public static void main(String args[])
    { 
        int A;
        System.out.println("Enter Any number");
        Scanner s=new Scanner(System.in);
        A=s.nextInt();
        while(A>0)
        {
            int lastnumber = A%10;
            System.out.print(lastnumber);
              A/=10;
        }
        System.err.println();
        s.close();
    }
}