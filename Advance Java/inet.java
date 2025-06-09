import java.net.*;
class inet
{
    public static void main(String args[])
    {

       try{
           InetAddress a=InetAddress.getByName("www.google.com");
           System.out.println("HostName: "+ a.getHostName());
            System.out.println("HostName: "+ a.getHostAddress());
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
    }
}