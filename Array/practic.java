package Array;

public class practic {
    public static void main(String args[])
    {
        int t=0;
        int A[]={2,4,6,8,10};
        for(int i=0;i<=A.length;i++)
        {
            for(int j=0;j<=A.length;j++)
        {
            for(int k=i;k<j;k++)
        {
            System.out.print(A[k]+" ");
            t++;
        }
        System.out.println();
        
        }
        
        System.out.println();
        }
        System.out.println("Iteration: "+t);
    }
   
}
