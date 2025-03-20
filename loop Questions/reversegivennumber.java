import java.util.*;

public class reversegivennumber {
    public static void main(String args[])
    {
    int A,r=0;
    System.out.println("Enter Any number");
    Scanner s=new Scanner(System.in);
    A=s.nextInt();
    while(A>0)
    {
        int lastnumber = A%10;
        r=r*10+lastnumber;
          A/=10;
    }
    System.out.print(r);
}
}
