package Array;

public class prfixsubarray {
    public static void main(String args[])
    {
        int A[]={2,4,6,8,10};
        int B[]=new int[A.length];
        B[0]=A[0];
        for(int i=1;i<B.length;i++)
            {
                B[i]=B[i-1]+A[i];
            }
       
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=i;j<A.length;j++)
            {
                sum= i==0 ? B[j] : B[j]-B[i-1];
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}
