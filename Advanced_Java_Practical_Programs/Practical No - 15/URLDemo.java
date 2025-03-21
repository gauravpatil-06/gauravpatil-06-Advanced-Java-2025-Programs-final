import java.net.*;
class URLDemo
{
   public static void main(String args[])throws MalformedURLException
    {
     URL u1=new URL("http://www.msbte.org.in");
     System.out.println("Protoclol="+u1.getProtocol());
     System.out.println("Host Name="+u1.getHost());
     System.out.println("Port Name="+u1.getPort());
     System.out.println("File path="+u1.getFile());
    }
 }
