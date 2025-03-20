package practise;

public class reverse {
    public static void main(String args[])
    {
        int k=45587569;
        int r=0;
        while(k>0)
        {
            int l=k%10;
            r=r*10+l;
             k=k/10;
        }
        System.out.println(r);
    }
    
}
