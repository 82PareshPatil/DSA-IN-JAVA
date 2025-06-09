import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class url {
 public static void main(String args[])
 {
    try{
    URL u=new URL("https://www.google.com");
    URLConnection o=u.openConnection();
    BufferedReader b=new BufferedReader(new InputStreamReader(o.getInputStream()));
    String line;
    while ((line=b.readLine()) != null) {
        System.out.println(line);
    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
 }   
}
