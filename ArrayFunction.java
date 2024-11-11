import java.util.*;
import java.lang.*;

public class ArrayFunction {
    public static void Upadate(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+1);
        }
    }
    public static void main(String args[])
    {
        int a[]=new int[3];
        a[0]=97;
        a[1]=87;
        a[2]=56;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Upadate(a);
    }
}
