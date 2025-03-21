 import java.net.*;
import java.util.Scanner;

public class IPAddressRetriever
 {
    public static void main(String[] args)throws UnknownHostException

	 {      
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the hostname: ");
            String hostname = scanner.nextLine();

            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP address of " + hostname + " is: " + address.getHostAddress());

            
        
     }
}
