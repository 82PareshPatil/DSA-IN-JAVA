package practise;

public class maxvalueturnary {
    public static void main(String args[])
    {
        int a=55,b=12,c=6;
        int r= (a>b) ?(a>c ? a:c):(b>c? b:c);
        System.out.println(r);
    }
}
