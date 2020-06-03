import java.net.InetAddress;
public class IPaddress
{
    public static void main()throws Exception
    {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("IP Address: "+inetAddress.getHostAddress());    
        System.out.println("IP Address: "+inetAddress.getHostName());
    }
}